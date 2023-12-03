package sw역량테스트.모의;

import java.util.Scanner;

public class 디저트카페 {

    static int[][] arr;
    static int T;
    static int N;
    static int max;
    static int startR;
    static int startC;
    static boolean[] count;
    static boolean[][] visit;

    //시계방향
    static int[] dr = {+1, +1, -1, -1};
    static int[] dc = {+1, -1, -1, +1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();

            arr = new int[N][N];
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }


            // 디저트 먹으러 출발
            max = Integer.MIN_VALUE;
            for (int r = 0; r < N - 2; r++) {
                for (int c = 1; c < N - 1; c++) {
                    visit = new boolean[N][N];
                    count = new boolean[101]; // 과일 중복했는지 안 했는지 확인 용
                    visit[r][c] = true;
                    count[arr[r][c]] = true;
                    dessert(r, c, r, c, 1, 0); // x좌표, y좌표, 칸수, 방향
                }
            }

            if (max == Integer.MIN_VALUE)
                max = -1;


            System.out.println("#" + tc + " " + max);
        }
    }

    private static void dessert(int r, int c, int startR, int startC, int cnt, int d) {

        for (int i = d; i < 4; i++) {

            int R = r + dr[i];
            int C = c + dc[i];

            // 범위 내에 있으면서
            if (R >= 0 && C >= 0 && R < N && C < N) {

                //만약 제자리에 다시오고 그 칸수가 그냥 자기 자신일때제외하고
                if ((R == startR) && (C == startC) && cnt > 1) {

                    max = Math.max(max, cnt);
                    System.out.println(max);

                    return;
                }


                if (!visit[R][C] && !count[arr[R][C]]) {

                    visit[R][C] = true;
                    count[arr[R][C]] = true;
                    dessert(R, C, startR, startC, cnt + 1, i);
                    visit[R][C] = false;
                    count[arr[R][C]] = false;
                }


            }


        }
    }

}
