package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 잃어버린괄호1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line, "-"); // 빼기 기준으로 토큰을 나눔

        int total = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {

            int tmp = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+"); // 빼기 기준으로 나누었으니 이제 + 기준으로 나누자

            while (st2.hasMoreTokens()) {
                tmp += Integer.parseInt(st2.nextToken());
            }

            // 첫번째 토큰 total로 초기화하고나서 그 다음부터 이제 빼기 시작
            if (total == Integer.MAX_VALUE) {
                total = tmp;
            } else {
                total -= tmp;
            }
        }
        System.out.println(total);
    }
}
