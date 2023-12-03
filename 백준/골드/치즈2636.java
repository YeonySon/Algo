package 백준.골드;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 치즈2636 {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] visit;
    static int lastCheese;
    static int cnt;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();


        arr = new int[N][M];
        cnt = 0;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                arr[r][c] = sc.nextInt();
                if (arr[r][c] == 1)
                    cnt++; // 전체 치즈개수
            }
        }


        // 테두리 치즈 없애자
        lastCheese = 0;
        int num = 0;
        while (cnt != 0) {

            visit = new boolean[N][M];
            lastCheese = cnt;
            bfs(0, 0); // 맨 위부터 탐색하자
            num++;

        }

        System.out.println(num);
        System.out.println(lastCheese);


    }

    private static void bfs(int r, int c) {

        Queue<int[]> q = new LinkedList<>();

        visit[r][c] = true;
        q.add(new int[]{r, c});

        while (!q.isEmpty()) {

            int[] pick = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];


                // 범위안에 있자
                if (R >= 0 && C >= 0 && R < N && C < M && !visit[R][C]) {

                    visit[R][C] = true;

                    if (arr[R][C] == 0) {
                        q.add(new int[]{R, C});
                    } else if (arr[R][C] == 1) {
                        arr[R][C] = 0;
                        cnt--; // 치즈 녹이자
                    }


                }


            }


        }


    }

}
