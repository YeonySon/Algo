package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class N과M7 {
    static int[] arr;
    static int[] result;
    static int N;
    static int M;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        result = new int[M];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);


        duplicatePerm(0);
        System.out.println(sb);

    }

    private static void duplicatePerm(int idx) {

        if (idx == M) {
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;

        }


        for (int i = 0; i < N; i++) {
            result[idx] = arr[i];
            duplicatePerm(idx+1);
        }

    }


}
