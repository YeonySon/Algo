package 백준.골드;

import java.util.Scanner;

public class 평범한배낭12865 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물건개수
        int maxWeight = sc.nextInt(); // 배낭최대무게
        // 0번째 물건은 없으니깐 배열 하나크게 설정
        int[] weight = new int[N+1]; // 무게 배열
        int[] value = new int[N+1]; // 점수배열

        int[][] dp = new int[N+1][maxWeight+1];

        for(int i=1; i<=N; i++){
            weight[i] = sc.nextInt(); // 물건의 무개
            value[i] = sc.nextInt(); // 물건의 가치
        }

        
        // 물건의 개수만큼 돌면서 최대무게만큼 또 돌자
        for(int i=1; i<=N; i++){
            for(int j=1; j<=maxWeight; j++){

                // 배낭무게보다 물건의 무게가 작은경우
                // (현재가치 + 현재물건에서의 무게를 뺀경우의 최대값) 이것과 그전물건으로 배낭넣었을때 비교
                if(weight[i]<=j){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i]);
                } else {
                    // 배낭보다 무게가 큰 물건
                    dp[i][j]  = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][maxWeight]);
    }
}
