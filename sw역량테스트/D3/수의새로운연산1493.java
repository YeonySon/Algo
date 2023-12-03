package sw역량테스트.D3;

import java.util.Scanner;

public class 수의새로운연산1493 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[][] arr = new int[300][300];

        for (int c = 1; c < 300; c++)
            arr[1][c] = ((c * c) - c + 2) / 2;


        for (int tc = 1; tc <= T; tc++) {

            //좌하
            int[] dr = {+1};
            int[] dc = {-1};

            for (int c = 2; c < 300; c++) {
                //좌대각선 아래로 계속 내려가게끔
                for (int j = 1; j < c; j++) {
                    arr[1 + (dr[0] * j)][c + (dc[0] * j)] = arr[1][c] + j;
                }
            }

            int a = sc.nextInt();
            int b = sc.nextInt();

            int r1 = 0;
            int r2 = 0;
            int c1 = 0;
            int c2 = 0;

            for (int r = 1; r < 300; r++) {
                for (int c = 1; c < 300; c++) {
                    if (arr[r][c] == a) {
                        r1 = r;
                        c1 = c;
                    }

                    if (arr[r][c] == b) {
                        r2 = r;
                        c2 = c;
                    }
                }
            }

            int result = arr[r1 + r2][c1 + c2];
            System.out.println("#" + tc + " " + result);
        }
    }
}
