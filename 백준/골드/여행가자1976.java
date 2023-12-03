package 백준.골드;

import java.util.Scanner;

public class 여행가자1976 {

    static Scanner sc;
    static int[] ceo;
    static int N;
    static int M;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ceo = new int[N];

        //대표를 만들자
        for (int i = 0; i < N; i++)
            ceo[i] = i;


        for (int i = 0; i < N; i++) {

            // 0일때는 무시 1일때만 union
            // i번째줄의 j번째 도시들과의 연결관계
            for (int j = 0; j < N; j++) {

                int num = sc.nextInt();
                if (num == 1) {
                    union(ceo[findset(i)], ceo[findset(j)]);
                }
            }
        }
        // 마지막 줄

        int first = findset(sc.nextInt() - 1); // 여행계획 첫번째 도시
        for (int i = 0; i < M - 1; i++) {
            int city = findset(sc.nextInt() - 1);

            // 대표값이 다르다면 여행 연결 못함
            if (first != city) {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }


    static int findset(int i) {

        if (ceo[i] != i)
            ceo[i] = findset(ceo[i]);

        return ceo[i];

    }

    static void union(int a, int b) {

        if (a < b) {
            ceo[b] = a;
        } else {
            ceo[a] = b;
        }

    }

}
