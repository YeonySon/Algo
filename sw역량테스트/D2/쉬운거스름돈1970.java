package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운거스름돈1970 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            int[] coins = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

            int money = Integer.parseInt(br.readLine());
            System.out.println("#"+tc);
            for(int i=0; i<coins.length; i++){

                int r = money / coins[i];
                money = money - (r*coins[i]);
                System.out.print(r + " ");

            }
            System.out.println();
        }
    }
}
