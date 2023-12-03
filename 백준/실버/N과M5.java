package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class N과M5 {
    static int[] arr;
    static int[] result;
    static boolean[] visit;
    static int N;
    static int M;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt(); // ~개 뽑자

        arr = new int[N];
        result = new int[M];
        visit = new boolean[N];

        // 원본 배열 받자
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        // 나중에 사전 순으로 증가하는걸 출력해야하므로 먼저 정렬하자
        Arrays.sort(arr);

        perm(0);

    }

    private static void perm(int idx) {

        if (idx == M) {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visit[i]) continue;

            visit[i] = true;
            result[idx] = arr[i];
            perm(idx + 1);
            visit[i] = false;
        }


    }

}
