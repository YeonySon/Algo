package sw역량테스트.D3;

import java.util.Scanner;

public class 삼성시의버스노선6485 {
    static Scanner sc;
    static int[] count;

    public static void main(String[] args) {

        //count배열을 하나만들어서
        //범위안에서 있으면 count배열을 +1 씩해준다
        //마지막에 그 값을 출력한다.

        sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            count = new int[5001];

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                int start = sc.nextInt();
                int end = sc.nextInt();

                //범위에 맞게 플러스 해줌
                //수직선 그려서 생각해보자 범위
                for (int k = start; k <= end; k++) {
                    count[k]++;
                }
            }

            int P = sc.nextInt(); // 5개

            System.out.print("#" + tc);
            for (int i = 0; i < P; i++) {
                System.out.print(" " + count[sc.nextInt()]);
            }
            System.out.println();
        }
    }
}
