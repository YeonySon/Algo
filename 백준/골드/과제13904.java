package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 과제13904 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int maxDay = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());

            maxDay = Math.max(maxDay, day);
            list.add(new int[]{day, score});
        }

        int sum = 0;
        for (int i = maxDay; i >= 1; i--) {

            int s = 0;
            int idx = -1;
            for (int j = 0; j < list.size(); j++) {
                // 맨처음부터 돌면서 그 날짜랑 같으면
                // 그 날짜이상이면서 그 중에서 가장 큰 점수를 선택하고
                // 선택했으면 최고값 다 찾고나서 점수 0 으로 초기화하기
                if (list.get(j)[0] >= i && list.get(j)[1] > s) {

                    s = list.get(j)[1];
                    idx = j;

                }
            }
            sum += s;
            if (idx!=-1)
                list.remove(idx);
        }
        System.out.println(sum);

    }
}
