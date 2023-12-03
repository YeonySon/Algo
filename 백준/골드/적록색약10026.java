package 백준.골드;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 적록색약10026 {

    static char[][] arr;
    static char[][] arr2;
    static boolean[][][] visit; // 적록색약용, 일반용
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};
    static int N;

    static int cnt1;
    static int cnt2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new char[N][N];
        arr2 = new char[N][N];
        for (int r = 0; r < N; r++) {
            String str = sc.next();
            for (int c = 0; c < N; c++) {
                arr[r][c] = str.charAt(c);
                if (str.charAt(c) == 'G') {
                    arr2[r][c] = 'R';
                } else {
                    arr2[r][c] = str.charAt(c);
                }
            }
        }

//        for(int r=0; r<N; r++){
//            for(int c=0; c<N; c++){
//                System.out.print(arr2[r][c] + " ");
//            }
//            System.out.println();
//        }

        visit = new boolean[2][N][N];

        cnt1 = 0;
        cnt2 = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (!visit[0][r][c]) {
                    bfs(r, c);
                    cnt1++;
                }

                if (!visit[1][r][c]) {
                    bfs2(r, c);
                    cnt2++;
                }


            }
        }

        System.out.println(cnt1 + " " + cnt2);


    }

    // 적록색약용
    private static void bfs2(int r, int c) {
        Queue<int[]> q = new LinkedList<>();

        char target = arr2[r][c]; // 기준 색

        q.add(new int[]{r, c});
        visit[1][r][c] = true;


        while (!q.isEmpty()) {

            int[] pick = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];

                //범위안에 있으면서
                if (R >= 0 && C >= 0 && R < N && C < N) {

                    // 같은 색깔이면서 방문한 적 없으면
                    if (!visit[1][R][C] && arr2[R][C] == target) {
                        q.add(new int[]{R, C});
                        visit[1][R][C] = true;
                    }
                }
            }//end for문
        } // end while문


    }


    // 일반인
    private static void bfs(int r, int c) {

        Queue<int[]> q = new LinkedList<>();

        char target = arr[r][c]; // 기준 색

        q.add(new int[]{r, c});
        visit[0][r][c] = true;


        while (!q.isEmpty()) {

            int[] pick = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];

                //범위안에 있으면서
                if (R >= 0 && C >= 0 && R < N && C < N) {

                    // 같은 색깔이면서 방문한 적 없으면
                    if (!visit[0][R][C] && arr[R][C] == target) {
                        q.add(new int[]{R, C});
                        visit[0][R][C] = true;
                    }
                }
            }//end for문
        } // end while문
    }
}
