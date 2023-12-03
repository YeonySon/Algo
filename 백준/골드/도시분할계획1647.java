package 백준.골드;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 도시분할계획1647 {

    static Scanner sc;
    static int N;
    static int M;
    static int[][] arr;
    static int[] parent;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M][3];

        for (int i = 0; i < M; i++) {

            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();

            arr[i][0] = a;
            arr[i][1] = b;
            arr[i][2] = c;
        }

        parent = new int[N];
        // 자기 자신 대표정하자
        for (int i = 0; i < N; i++)
            parent[i] = i;

        // 최소비용으로 해야하므로 가중치 기준 오름차순으로 정렬하고 나서 이제 도로 이어주자
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });


        int pick = 0;
        int sum = 0;
        int cost = 0;
        for (int i = 0; i < M; i++) {

            int a = parent[findset(arr[i][0])];
            int b = parent[findset(arr[i][1])];


                union(a, b);
                pick++;
                cost = arr[i][2];
                sum += arr[i][2];


            if (pick == N - 1) break;

        }
        System.out.println(sum-cost); // 마지막 즉 가중치가 높은 연결선만 끊어주면 마을 2개로 나눌 수 있고 최소비용이다

    }

    private static int findset(int i) {

        // path 컴프레션
        if (parent[i] != i)
            parent[i] = findset(parent[i]);

        return parent[i];

    }

    private static void union(int a, int b) {

        parent[b] = a;

    }

}
