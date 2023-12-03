package 백준.실버;

import java.util.Scanner;

public class 도영이가만든음식2961 {
    static Scanner sc;
    static int[][] arr;
    static int[][] tmp;
    static int N;
    static boolean[] visit;
    static int min;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][2];
        tmp = new int[N][2];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt(); // 신맛
            arr[i][1] = sc.nextInt(); // 쓴맛
//            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

        min = Integer.MAX_VALUE;

        df(0);
        System.out.println(min);

    }

    private static void df(int depth) {
        // TODO Auto-generated method stub

        if (depth == N) {

            int sourScore = 1;
            int bitScore = 0;

//            for (int r = 0; r < tmp.length; r++) {
//                System.out.println(tmp[r][0] + " " + tmp[r][1]);
//            }
//            System.out.println();

            boolean flag = false;
            for (int i = 0; i < N; i++) {

                if (visit[i]) {
                    flag = true;
                    sourScore *= arr[i][0];
                    bitScore += arr[i][1];

                }
            }
            if(flag == false) return; // 다 false인 경우이므로

            min = Math.min(min, Math.abs(sourScore - bitScore));

            return;
        }

        visit[depth] = true;
        df(depth + 1);

        visit[depth] = false;
        df(depth + 1);

    }

}
