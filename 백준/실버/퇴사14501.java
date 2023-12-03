package 백준.실버;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 퇴사14501 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 날짜

        int[] day = new int[N+1];
        int[] money = new int[N+1];
        int[] dp = new int[N + 1];

        for (int i = 0; i < N; i++) {

            day[i] = sc.nextInt();
            money[i] = sc.nextInt();

        }


        for (int i = 0; i < N; i++) {



            if ((i + day[i]) <= N) {
                dp[i + day[i]] = Math.max(dp[i + day[i]], dp[i] + money[i]);
            }
            
            // 상담진행날짜 안에서는 그 날짜는 돈은 그 날짜 첨 시작이랑 같다
            dp[i+1] = Math.max(dp[i],dp[i+1]);
            
        }

        System.out.println(dp[N]);


    }
}
