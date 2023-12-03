package 백준.골드;

import java.util.Scanner;

public class 욕심쟁이판다1937 {

    static int[][] arr;
    static int[][] dp;
    static int N;

    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         N = sc.nextInt();

        arr = new int[N][N];
        dp = new int[N][N]; // 경로 경우의수 저장용

        // 대나무숲
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }


        // 판다 출발하자
        int result = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // 비교하면서 최대값 갱신
                result = Math.max(result, dfs(r,c));
            }
        }

        System.out.println(result);

//        for (int r = 0; r < N; r++) {
//            for (int c = 0; c < N; c++) {
//                System.out.print(dp[r][c] + " ");
//            }
//            System.out.println();
//        }


    }

    private static int dfs(int r, int c) {

        // 이미 경로가 체크되었으면 그거 리턴해주자
        if (dp[r][c] != 0) {
            return dp[r][c];
        }

        // 본인자리 온거니깐 1
        dp[r][c] = 1;

        for (int i = 0; i < 4; i++) {


            int R = r + dr[i];
            int C = c + dc[i];

            // 범위안에
            if (R >= 0 && R < N && C >= 0 && C < N) {

                // 대나무 먹을 수 있니?
                if (arr[r][c] < arr[R][C]) {
                    // 먹을 수 있는 곳까지 가고
                    // 거기서 최대값 비교해서 자기자리 포함해서 비교
                    dp[r][c] = Math.max(dfs(R,C)+1, dp[r][c]);
                }
            }
        }
        return dp[r][c];
    }

}
