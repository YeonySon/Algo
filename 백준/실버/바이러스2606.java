package 백준.실버;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 바이러스2606 {
    // bfs로 풀어보자

    static int[][] arr; // 행렬만들자
    static boolean[] visit;
    static int N;
    static int M;
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][N]; // 바이러스 지도 만들거
        visit = new boolean[N];

        // 쌍을 연결해주자
        for (int i = 0; i < M; i++) {

            int s = sc.nextInt() - 1;
            int e = sc.nextInt() - 1;

            arr[s][e] = 1;
            arr[e][s] = 1;

        }


        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        visit[0] = true;
        for (int c = 0; c < N; c++) {
            if (arr[0][c] == 1) {
                visit[c] = true;
                q.add(c);
            }
        }

        while (!q.isEmpty()) {

            int peek = q.poll();
            for (int col = 0; col < N; col++) {
                if (!visit[col] && arr[peek][col] == 1) {
                    q.add(col);
                    visit[col] = true;
                }
            }


        }

//        System.out.println(Arrays.toString(visit));

        for (int i = 1; i < N; i++) {
            if (visit[i])
                cnt++;
        }

        System.out.println(cnt);

    }

}

