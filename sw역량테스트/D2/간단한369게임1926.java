package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 간단한369게임1926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            int num = i;
            int count = 0;
            while (num > 0) {
                int targetNumber = num % 10;
                num /= 10;

                if (targetNumber % 3==0 && targetNumber!=0) {
                    count++;
                }
            }
            if (count == 0)
                System.out.print(i);
            for (int j = 1; j <= count; j++) {
                System.out.print("-");
            }
            System.out.print(" ");
        }
    }

}

