package 백준.실버;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 안전영역2468 {
    static Scanner sc;
    static int N;
    static int[][] arr;
    static boolean[][] visit;
    static int maxRain;
    static int max;
    static Queue<int[]> q;

    static int[][] tmp;

    //상 하 좌 우
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];

        maxRain = Integer.MIN_VALUE; // 최대잠길수있는 물의 높이
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                int num = sc.nextInt();
                maxRain = Math.max(maxRain, num); // 최대잠길수있는 높이 찾기
                arr[r][c] = num;
            }
        }

        max = Integer.MIN_VALUE; // 최대개수

        // 물의 높이는 0~maxRain-1 만큼을 하나씩 새로운 배열을 복사해서
        // 잠기면 0 안 잠기면 1로 바꿔서 최대 지역을 세준다
        for (int i = 0; i < maxRain; i++) {
            visit = new boolean[N][N];
            tmp = new int[N][N];

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    tmp[r][c] = arr[r][c];
                }
            }


            q = new LinkedList<>();
            int cnt = 0;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (tmp[r][c] <= i) {
                        tmp[r][c] = 0;
                    } else {
                        tmp[r][c] = 1;
                    }
                }
            }

//            for(int r=0; r<N; r++){
//                for(int c=0; c<N; c++){
//                    System.out.print(tmp[r][c] + " ");
//                }
//                System.out.println();
//            }

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (!visit[r][c] && tmp[r][c] == 1) {
                        bfs(r, c);
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

    private static void bfs(int row, int col) {

        q.add(new int[]{row, col});
        visit[row][col] = true;

        while (!q.isEmpty()) {

            int[] peek = q.poll();
            for (int i = 0; i < 4; i++) {

                int R = peek[0] + dr[i];
                int C = peek[1] + dc[i];

                if (R >= 0 && C >= 0 && R < N && C < N && !visit[R][C] && tmp[R][C] == 1) {
                    q.add(new int[]{R, C});
                    visit[R][C] = true;
                }
            }
        }
    }
}
