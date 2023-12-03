package sw역량테스트.모의;

import java.util.Scanner;

public class 설탕배달dp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 1];

        // 모든 주머니의 초기값은 최대값으로 지정
        // 0번째는 0으로 두기
        for (int i = 1; i <= N; i++)
            dp[i] = Integer.MAX_VALUE - 1;

        for (int i = 3; i <= N; i++) {

            // 5보다 작을 때는 3kg 짜리만 설탕주머니에 넣으면 된다
            if (i < 5) {
                dp[i] = Math.min(dp[i], dp[i - 3]) + 1;
            } else {
                // 여기서부터는 3kg 와 5kg 짜리 두개 비교하면서 최소값을 넣기
                dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
            }
        }
        if (dp[N] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[N]);
        }
    }
}
