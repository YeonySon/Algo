package 백준.실버;

import java.util.Scanner;

public class 로또6603 {
    static int[] arr;
    static boolean[] visit;
    static int[] result;

    static int N;
    static int M = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            N = sc.nextInt();

            if (N == 0) {
                break;
            }

            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            visit = new boolean[N];
            result = new int[M];

            dfs(0, 0);
            System.out.println();


        }

    }

    private static void dfs(int start, int idx) {


        if (idx == M) {

            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();

            return;
        }


        for (int i = start; i < N; i++) {

            if (visit[i] == false) {


                visit[i] = true;

                result[idx] = arr[i];

                dfs(i, idx + 1);

                visit[i] = false;

            }


        }


    }
}
