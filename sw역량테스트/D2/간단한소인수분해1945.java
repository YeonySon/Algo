package sw역량테스트.D2;

import java.util.Scanner;

public class 간단한소인수분해1945 {
    public static void main(String[] args) {

        // N=2^a x 3^b x 5^c x 7^d x 11^e 에서 각각의 소인수가 몇개 나오는지 출력

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int num = sc.nextInt();
            int countA = 0;
            int countB = 0;
            int countC = 0;
            int countD = 0;
            int countE = 0;


            while (num % 2 == 0) {
                num = num / 2;
                countA++;
            }
            while (num % 3 == 0) {
                num = num / 3;
                countB++;
            }
            while (num % 5 == 0) {
                num = num / 5;
                countC++;
            }
            while (num % 7 == 0) {
                num = num / 7;
                countD++;
            }
            while (num % 11 == 0) {
                num = num / 11;
                countE++;
            }

            System.out.println("#" + tc + " " + countA + " " + countB + " " + countC + " " + countD + " " + countE);


        }

    }


}
