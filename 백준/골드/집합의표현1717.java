package 백준.골드;

import java.util.Scanner;

public class 집합의표현1717 {

    static Scanner sc;
    static int[] ceo;
    static int N;
    static int M;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ceo = new int[N+1];

        // 대표를 만들어주자
        for (int i = 0; i < N+1; i++)
            ceo[i] = i;

        for (int i = 0; i < M; i++) {

            int num = sc.nextInt();
            int a = ceo[findset(sc.nextInt())];
            int b = ceo[findset(sc.nextInt())];

            if (num == 0) {
                union(a, b);
            } else if(num==1) {
                if (a == b) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                continue;
            }
        }


    }

    private static void union(int a, int b) {

        if(a<b)
            ceo[b] = a;
        else
            ceo[a] = b;

    }

    private static int findset(int a) {

        if (ceo[a] != a)
            ceo[a] = findset(ceo[a]);

        return ceo[a];

    }


}
