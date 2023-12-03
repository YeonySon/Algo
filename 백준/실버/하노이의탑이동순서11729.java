package 백준.실버;

import java.util.Scanner;

public class 하노이의탑이동순서11729 {

    static StringBuilder sb;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sb = new StringBuilder();


        int res = (int) Math.pow(2, N) - 1; //횟수
        sb.append(res).append("\n");

        hanoi(N, 1, 2, 3);

        System.out.println(sb);


    }

    private static void hanoi(int n, int a, int b, int c) {

        // 원판이 한 개일때
        if (n == 1) {

            sb.append(a).append(" " + c).append("\n");

            return;
        }


        // 가운데 b에다가 가장 밑에있은 원판 빼고 옮기자
        hanoi(n - 1, a, c, b);


        // 한개의 원판을 마지막자리로 옮기자
        sb.append(a).append(" " + c).append("\n");


        // 젤 큰 원판 c에 옮겼으면 나머지들 c에다가 옮기자
        hanoi(n - 1, b, a, c);


    }


}
