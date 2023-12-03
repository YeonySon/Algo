package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 새로운불명증치료법1288 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            boolean[] check = new boolean[10];
            String line = br.readLine();
            int multiple = 1;
            int count = 0;
            while (true) {
                int num = Integer.parseInt(line)*multiple;
                String line2 = String.valueOf(num);

                for(int i=0; i<line2.length(); i++){
                    if(check[line2.charAt(i)-'0']==false){
                        check[line2.charAt(i)-'0'] = true;
                        count++;
                    }
                }
                multiple++;

                if (count==10){
                    System.out.println("#"+tc+" "+num);
                    break;
                }
            }

        }


    }
}
