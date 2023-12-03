package 백준.실버;

import java.util.Scanner;

public class 더하기9095 {
    static Scanner sc;
    static int[] arr;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            arr = new int[11];
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;

            for (int i = 4; i <= N; i++) {
                arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
            }

            System.out.println(arr[N]);
        }
    }
}
