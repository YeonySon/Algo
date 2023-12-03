package 백준.골드;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 말이되고픈원숭이1600 {
    static int[][] arr;
    static boolean[][][] visit;
    static int K;
    static int M;
    static int N;
    static int min;

    // 상하좌우
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    //나이트이동
    //시계뱡향
    static int[] kr = {-2, -1, +1, +2, +2, +1, -1, -1};
    static int[] kc = {+1, +2, +2, +1, -1, -2, -2, -1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        K = sc.nextInt(); // 말로 움직일 수 있는 횟수

        M = sc.nextInt(); // 열
        N = sc.nextInt(); // 행

        arr = new int[N][M];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                arr[r][c] = sc.nextInt();
            }
        }


        visit = new boolean[K + 1][N][M]; // 3차원 배열 활용해서 횟수에 따른 지도 따로 만들자
        min = Integer.MAX_VALUE;
        bfs(0, 0); // 맨 왼쪽에서 시작해서 맨 밑 오른쪽으로간다

        if (min == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);


    }

    private static void bfs(int r, int c) {
        // TODO Auto-generated method stub
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c, 0, K}); // x좌표, y좌표, 이동횟수, k번째이용(남은횟수)
        visit[K][r][c] = true;

        while (!q.isEmpty()) {

            int[] peek = q.poll();

            if (peek[0] == N - 1 && peek[1] == M - 1) {

                min = Math.min(min, peek[2]);
                return;
            }

            // 말 이동횟수 이용할때
            if (peek[3] > 0) {

                for (int i = 0; i < 8; i++) {
                    int R = peek[0] + kr[i];
                    int C = peek[1] + kc[i];
                    int cnt = peek[2];
                    int k = peek[3]; // 말처럼 이동할 수 있는 횟수

                    if (R >= 0 && C >= 0 && R < N && C < M) {

                        if (!visit[k - 1][R][C] && arr[R][C] == 0) {
                            q.add(new int[]{R, C, cnt + 1, k - 1});
                            visit[k - 1][R][C] = true;
                        }
                    }
                }
            }
            // 그냥 원숭이처럼 움직일 때

            for (int i = 0; i < 4; i++) {
                int R = peek[0] + dr[i];
                int C = peek[1] + dc[i];
                int cnt = peek[2];
                int k = peek[3]; // 말처럼 이동할 수 있는 횟수

                //범위안에
                if (R >= 0 && C >= 0 && R < N && C < M) {
                    //방문한적 없고 이동할 수 있는 곳
                    if (!visit[k][R][C] && arr[R][C] == 0) {
                        q.add(new int[]{R, C, cnt + 1, k});
                        visit[k][R][C] = true;
                    }
                }
            }
        }
    }
}

