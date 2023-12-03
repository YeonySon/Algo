package 백준.실버;

import java.util.Scanner;

public class RGB거리1149 {
    static int[][] color;
    static int[][] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        color = new int[T][3]; // r g b 담을 배열 생성
        dp = new int[T][3]; // 누적합 구할 배열

        for (int i = 0; i < T; i++) {
            color[i][0] = sc.nextInt(); // 빨강 비용
            color[i][1] = sc.nextInt(); // 그린 비용
            color[i][2] = sc.nextInt(); // 블루 비용
        }

        // 초기값 설정
        dp[0][0] = color[0][0];
        dp[0][1] = color[0][1];
        dp[0][2] = color[0][2];

        int result = Math.min(dynamic(T - 1, 0), Math.min(dynamic(T - 1, 1), dynamic(T - 1, 2)));
        System.out.println(result);
    }

    // 그 색깔의 누적합은 그 전 행렬의 다른 색들 중 작은 값을 더해줘야 최종적으로 최소비용으로 칠 할 수 있다
    static int dynamic(int T, int num) {

        if (dp[T][num] == 0) {
            //빨강
            if (num == 0) {
                dp[T][0] = color[T][0] + Math.min(dynamic(T-1,1),dynamic(T-1,2));
            } else if (num == 1) {
                //그린
                dp[T][1] = color[T][1] + Math.min(dynamic(T-1,0),dynamic(T-1,2));
            } else {
                //블루
                dp[T][2] = color[T][2] + Math.min(dynamic(T-1,1),dynamic(T-1,0));
            }
        }
        return dp[T][num]; // 이미 값이 있으면 리턴
    }
}
