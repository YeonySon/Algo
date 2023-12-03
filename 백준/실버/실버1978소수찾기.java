package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실버1978소수찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String word = br.readLine();
        StringTokenizer st = new StringTokenizer(word, " ");
        //처음입력받은 숫자의 개수를 처음부터 적용
        int count = t;
        for(int i=0; i<t; i++){
            int num = Integer.parseInt(st.nextToken());
            //1을 소수가 아니기때문에
            if (num==1)
                count--;
            
            //2~자기자신-1 한 것만큼에서 나눠지는게 있으면 소수 아님
            for (int j=2; j<num; j++){
                if (num%j == 0) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
