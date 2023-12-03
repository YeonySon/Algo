package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 시각덧셈1976 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line," ");

            int pHour = Integer.parseInt(st.nextToken());
            int pMin = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int realHour = pHour+h;
            int realMin = pMin+m;

            if (realHour>12){
                realHour=realHour-12;
            }

            if (realMin>60){
                realMin=realMin-60;
                realHour = realHour+1;
            }

            System.out.println("#"+tc+ " " + realHour+" "+realMin);


        }



    }
}
