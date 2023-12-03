package 백준.실버;

import java.util.*;

public class 영역구하기2583 {

    static int[][] arr;
    static int N;
    static int M;
    static boolean[][] visit;
    static int cnt;

    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    static List<Integer> list;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        M = sc.nextInt(); // 열
        N = sc.nextInt(); // 행
        int K = sc.nextInt(); // 개수

        arr = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < K; i++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt() - 1;
            int y2 = sc.nextInt() - 1;


            for (int c = y1; c <= y2; c++) {
                for (int r = x1; r <= x2; r++) {
                    arr[r][c] = 1;
                }
            }
        }

//        for(int r=0; r<N; r++){
//            for(int c=0; c<M; c++){
//                System.out.print(arr[r][c] + " ");
//            }
//            System.out.println();
//        }

        cnt = 0;
        list = new ArrayList<>(); // 넓이 집어넣을거
        // bfs 돌면서 확인하자
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (!visit[r][c] && arr[r][c] == 0) {
                    bfs(r, c);
                }
            }
        }

        Collections.sort(list);

        System.out.println(cnt); // 영역개수

        for (int num : list) {
            System.out.print(num + " ");
        }


    }

    private static void bfs(int r, int c) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{r, c});
        visit[r][c] = true;
        int sum = 1;

        while (!q.isEmpty()) {

            int[] pick = q.poll();


            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];

                // 범위안에 있으면서
                if (R >= 0 && C >= 0 && R < N && C < M) {
                    // 방문한적도 없고 0 이면
                    if (!visit[R][C] && arr[R][C] == 0) {
                        q.add(new int[]{R, C});
                        visit[R][C] = true;
                        sum++;
                    }
                }
            }
        }
        list.add(sum);
        cnt++;
    }
}
