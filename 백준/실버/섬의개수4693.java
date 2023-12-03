package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬의개수4693 {
    static Scanner sc;
    static int[][] arr;
    static boolean[][] visit;
    static int M;
    static int N;
    static Queue<int[]> q;

    //8방 상 하 좌 우 좌상 좌하 우상 우하
    static int[] dr = {-1, +1, 0, 0, -1, +1, -1, +1};
    static int[] dc = {0, 0, -1, +1, -1, -1, +1, +1};

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        while (true) {
            M = sc.nextInt(); // 열
            N = sc.nextInt(); // 행

            if (M == 0 && N == 0)
                System.exit(0);

            arr = new int[N][M];
            visit = new boolean[N][M]; // 방문

            q = new LinkedList<>();

            //넣어주자
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            int cnt = 0; // 섬의 개수
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {

                    // 방문한 적도 없고 1인곳을 찾아 그때부터 간선체크하자
                    if (!visit[r][c] && arr[r][c] == 1) {
                        bfs(r, c);
                        cnt++;
                    }

                }
            }
            System.out.println(cnt);
        }
    }

    //너비탐색
    private static void bfs(int row, int col) {

        // 중복피하려고 일단 큐에 넣고 그 다음 방문처리
        q.add(new int[]{row, col});
        visit[row][col] = true;

        while (!q.isEmpty()) {

            int[] peek = q.poll();

            for (int i = 0; i < 8; i++) {

                int R = peek[0] + dr[i];
                int C = peek[1] + dc[i];

                // 범위에 벋어나지 않고 방문한 적도 없으며 값이 1일때
                if (R >= 0 && C >= 0 && R < N && C < M && !visit[R][C] && arr[R][C] == 1) {
                    q.add(new int[]{R, C});
                    visit[R][C] = true;
                }

            }
        }
    }
}
