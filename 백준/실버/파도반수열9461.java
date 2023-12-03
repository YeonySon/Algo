package 백준.실버;

import java.util.Scanner;

public class 파도반수열9461 {
    static Scanner sc;
    static long[] arr; // int로 했을때 100넣었더니 int범위 넘어감

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        arr = new long[101]; // N의 최댓값이 100
        int T = sc.nextInt(); // 테스트케이스

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt(); // 몇번째
            System.out.println(dynamic(N));

        }
    }

    static long dynamic(int N) {

        if (N == 1) return arr[1] = 1;
        if (N == 2) return arr[2] = 1;
        if (N == 3) return arr[3] = 1;

        if (arr[N] != 0) return arr[N]; // 중복계산 피하기위해 이미 계산한거 반환
        else arr[N] = dynamic(N - 3) + dynamic(N - 2); // 인접한 계산결과는 다음다음에서 나옴

        return arr[N];
    }
}
