package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜계산기1948 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int tc=1; tc<=t; tc++){

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");

            int firstMonth = Integer.parseInt(st.nextToken());
            int firstDay = Integer.parseInt(st.nextToken());
            int lastMonth = Integer.parseInt(st.nextToken());
            int lastDay = Integer.parseInt(st.nextToken());

            //입력받은 달의 전 달까지 day합 구하기
            int sum1 = 0;
            int sum2 = 0;
            for (int i=0; i<firstMonth-1; i++){
                sum1 += month[i];
            }
            for (int j=0; j<lastMonth-1; j++){
                sum2 += month[j];
            }

            int realMonth = sum2 - sum1;
            int realDay = lastDay - firstDay;
            int result = realMonth + realDay;

            System.out.println("#"+tc+" "+(result+1));

        }

    }
}
