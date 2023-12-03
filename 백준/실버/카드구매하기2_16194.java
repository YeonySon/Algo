package 백준.실버;


import java.util.Arrays;
import java.util.Scanner;

public class 카드구매하기2_16194 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] card = new int[N + 1];
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++){
            card[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }


        // 카드 4개를 구매한다 했을 때
        // 1개짜리 구매하고 나머지 3개 구매
        // 2개짜리 구매하고 나머지 2개 구매
        // i개 구매할 때는
        // 1개 구매하고 i- 1개 이런 식으로
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                dp[i] = Math.min(dp[i],dp[i-j]+card[j]);
            }
        }

        System.out.println(dp[N]);






    }
}
