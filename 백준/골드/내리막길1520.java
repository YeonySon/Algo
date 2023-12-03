package 백준.골드;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 내리막길1520 {

    static int N;
    static int M;
    static int[][] arr;
    static int[][] dp;
    static boolean[][] visit;
    static int cnt;

    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        dp = new int[N][M];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                arr[r][c] = sc.nextInt();
                dp[r][c] = -1;
            }
        }

        cnt = 0;
//        visit = new boolean[N][M];
        int count = dfs(0, 0);

        System.out.println(count);


//        System.out.println(cnt);

    }

    private static int dfs(int r, int c) {
        // TODO Auto-generated method stub

        // 끝에 도달하면
        if (r == N - 1 && c == M - 1) {

            return 1;
        }

        if (dp[r][c] != -1) {
            // 이미 지나온 경로이므로

            return dp[r][c];

        } else {

            // 시초 줄이기

            // 아직 방문한 경로가 아닌 경우
            dp[r][c] = 0;

            for (int i = 0; i < 4; i++) {

                int R = r + dr[i];
                int C = c + dc[i];


                // 범위 안에
                if (R >= 0 && C >= 0 && R < N && C < M) {

                    if (arr[R][C] < arr[r][c]) {

                        // 해당 칸에서 목적지까지 경로
                        dp[r][c] += dfs(R, C);

                    }

                }

            } // end for 문

        }
        // 다 끝나고 나서 리턴
        return dp[r][c];

    }

}