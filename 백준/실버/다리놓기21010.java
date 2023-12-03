package 백준.실버;

import java.util.Scanner;

public class 다리놓기21010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스
        for (int tc = 1; tc <= T; tc++) {

            int M = sc.nextInt();
            int N = sc.nextInt();

            int[][] dp = new int[30][30];

            // 누가 크다고 문제에서 주워지지 않아서 큰놈을 앞에다가
            // 조합진행
            System.out.println(combi(dp, Math.max(N, M), Math.min(N, M)));

        }

    }

    // 조합, 파스칼 삼각형 이용
    private static int combi(int[][] dp, int n, int m) {

        if (m == n || m == 0) return 1; // nCo nCn 인 경우는 1가지

        if (dp[n][m] != 0) return dp[n][m];

        // 아니라면
        return dp[n][m] = combi(dp, n - 1, m - 1) + combi(dp, n - 1, m);


    }

}
