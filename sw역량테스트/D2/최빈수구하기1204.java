package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최빈수구하기1204 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            int test = Integer.parseInt(br.readLine());
            int[] check = new int[101];
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()){
                check[Integer.parseInt(st.nextToken())]++;
            }
            int max = 0;
            int idx = 0;
            for (int i=0; i<check.length; i++){
                max = Math.max(max,check[i]);
                if (max==check[i])
                    idx=i;
            }
            System.out.println("#"+tc+" "+idx);





        }


    }
}
