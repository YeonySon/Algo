package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Foursquares17626 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 제곱수들은 무조건 1 이므로 신경 안 써도 되고 그 제곱수와 나머지중 작은 것을 선택해야한다
        // 예를 들어 7일경우 제곱수1일경우 dp[6]
        // 제곱수2일경우 dp[3] 즉 둘 중 작은 경우 그게 답이 된다.

        int[] dp = new int[50001];
        dp[0]=0;
        dp[1]=1;

        for(int i=2; i<=num; i++){
            int min = Integer.MAX_VALUE;

            for(int j=1; j*j<=i; j++){
                int a = i-(j*j);
                min=Math.min(min,dp[a]);
            }
            dp[i] = min + 1;
        }
        System.out.println(dp[num]);

    }
}
