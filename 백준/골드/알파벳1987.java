package 백준.골드;

import java.util.Scanner;

public class 알파벳1987 {

    static int N;
    static int M;
    static int max;
    static char[][] arr;
    static boolean[] visit;
    static int cnt;
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new char[N][M];

        // 입력
        for (int r = 0; r < N; r++) {

            String str = sc.next();

            for (int c = 0; c < M; c++) {
                arr[r][c] = str.charAt(c);
            }
        }

        max = Integer.MIN_VALUE;


        visit = new boolean[26]; // 알파벳 중복 방지
        dfs(0, 0, 1); // 좌측상단에서 시작해야함, 나중에 기저조건에서는 sum+1한 형태로 들어오므로 마지막 출력값은 -1


        System.out.println(max);


    }

    private static void dfs(int r, int c, int sum) {
        // TODO Auto-generated method stub


        if (visit[arr[r][c] - 'A']) {

            max = Math.max(sum-1, max);

            return;

        } else {

            visit[arr[r][c] - 'A'] = true;

            for (int i = 0; i < 4; i++) {

                int R = r + dr[i];
                int C = c + dc[i];

                // 범위 안에 있자~~
                if (R >= 0 && C >= 0 && R < N && C < M) {

//                    System.out.print(arr[R][C] + " " + "행 " + R + " 열 " + C + " /");

                    dfs(R, C, sum + 1);

                }

            } // end for문

            visit[arr[r][c] - 'A'] = false;

        }

    }
}