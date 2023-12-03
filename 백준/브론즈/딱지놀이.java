package 백준.브론즈;

import java.util.Scanner;

public class 딱지놀이 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int aRes = sc.nextInt();
            int[] countA = new int[5];
            for (int i = 1; i <= aRes; i++) {
                countA[sc.nextInt()]++;
            }

            int bRes = sc.nextInt();
            int[] countB = new int[5];
            for (int i = 1; i <= bRes; i++) {
                countB[sc.nextInt()]++;
            }

            String result = null;

            //카운트 횟수를 비교
            for (int i = 4; i > 0; i--) {

                if (countA[i] - countB[i] > 0) {
                    result = "A";
                    break;
                } else if (countA[i] - countB[i] < 0) {
                    result = "B";
                    break;
                } else {
                    //0일경우 계속 continue해줘서 끝가지 가도 0이면을 구현
                    result = "D";
                    continue;
                }
            }
            System.out.println(result);
        }
    }
}
