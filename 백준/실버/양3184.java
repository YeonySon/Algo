package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 양3184 {


    static char[][] map;
    static boolean[][] visit;
    static int N;
    static int M;
    static int shipCnt;
    static int wolfCnt;

    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new char[N][M];

        for (int r = 0; r < N; r++) {
            String str = sc.next();

            for (int c = 0; c < M; c++) {
                map[r][c] = str.charAt(c);
            }
        }

        visit = new boolean[N][M];

        shipCnt = 0;
        wolfCnt = 0;

        // bfs 돌면서 울타리 제외한곳을 돌자
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (!visit[r][c] && map[r][c] != '#') {
                    bfs(r, c);
                }
            }
        }

        System.out.println(shipCnt + " " + wolfCnt);


    }

    private static void bfs(int r, int c) {

        Queue<int[]> q = new LinkedList<>();

        visit[r][c] = true;

        q.add(new int[]{r, c});

        int ship = 0;
        int wolf = 0;
        while (!q.isEmpty()) {

            int[] pick = q.poll();

            if (map[pick[0]][pick[1]] == 'v') {
                wolf++;
            }

            if (map[pick[0]][pick[1]] == 'o') {
                ship++;
            }

            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];

                if (R >= 0 && C >= 0 && R < N && C < M) {

                    if (!visit[R][C] && map[R][C] != '#') {
                        visit[R][C] = true;
                        q.add(new int[]{R, C});
                    }
                }

            }
        } // end while

        if(ship > wolf){
            shipCnt += ship;
        } else {
            wolfCnt += wolf;
        }


    }
}
