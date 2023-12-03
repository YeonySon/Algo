package 백준.실버;

import java.util.Scanner;

public class 타일1904 {

    static Scanner sc;
    static int[] dp;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt(); // 길이 입력

        dp = new int[10000001]; // 자연수 N의 최댓값이 1000000 이다.


        System.out.println(dynamic(N));

    }
    // N==1 -> 1
    // N==2 -> 00 11
    // N==3 -> 001 100 111
    // N==4 -> 0000 0011 1001 1100 1111
    // N==5 -> 00001 00111 00100 10000 11001 11100 10011 11111

    static int dynamic(int N) {

        if (N == 1) return dp[1] = 1;
        if (N == 2) return dp[2] = 2;

        if (dp[N] != 0) return dp[N]; // 메모리제이션, 이미 계산된거임 중복계산 방지

        else dp[N] = dynamic(N - 2) + dynamic(N - 1);

        dp[N] %= 15746; // 모듈연산자, 안쓰게되면 int범위 초과하는 경우 생김

        return dp[N];

    }

}
