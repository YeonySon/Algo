package 백준.골드;

import java.util.*;

public class 다리만들2 {
    static int[][] arr;
    static boolean[][] visit;
    static int N;
    static int M;
    static int num;

    static class Point {
        int x, y, v;

        public Point(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }

    //상 하 좌 우
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};
    static int[] dist;
    static List<int[]>[] list;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N][M];
        visit = new boolean[N][M];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                arr[r][c] = sc.nextInt();
            }
        }


        //섬을 만들자
        num = 2;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (arr[r][c] == 1)
                    bfs(r, c);
            }
        }

        //인접리스트 만들 방 만들기
        list = new ArrayList[num + 1];
        for (int i = 0; i < num + 1; i++)
            list[i] = new ArrayList<>();

        System.out.println();
        print();
        System.out.println();

        //섬끼리 연결을 할 때 최소거리만 단 거리는 2이상인 것들 중에서
        //만들어진 섬의 개수에서 거리를 인접행렬이나 인접리스트로 만들어서
        //크루스칼 활용해보자


        // 가로방향 길
        for(int r=0; r<N; r++){
            int compare = 0;
            int idx = 0;
            for(int c=0; c<M; c++){
                if(arr[r][c] != 0){
                    compare = arr[r][c];
                    idx = c;
                    if(arr[r][c] != compare){

                    }

                }
            }
        }




        int number = 2;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (arr[r][c] == number) {
                    dist = new int[num + 1];
                    bfs2(r, c);
                    number++;
                }
            }
        }

        for (int i = 2; i < num + 1; i++) {
            for (int j = 2; j < num + 1; j++) {
                System.out.println(i + "번째섬에서 연결 " + list[i].get(j)[0] + " " + list[i].get(j)[1]);
            }
        }


    }


    // 섬사이의 거리르 구하자
    private static void bfs2(int r, int c) {



    }

    //섬을 합치자
    private static void bfs(int r, int c) {

        Queue<Point> q = new LinkedList<>();
        arr[r][c] = num;
        q.add(new Point(r, c, 0));
        visit[r][c] = true;

        while (!q.isEmpty()) {

            Point peek = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = peek.x + dr[i];
                int C = peek.y + dc[i];
                int V = peek.v;

                //범위안에 있으면서
                if (R >= 0 && C >= 0 && R < N && C < M) {

                    if (!visit[R][C] && arr[R][C] == 1) {
                        arr[R][C] = num;
                        q.add(new Point(R, C, V));
                        visit[R][C] = true;
                    }

                }

            }
        }
        num++;
    }

    static void print() {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

}
