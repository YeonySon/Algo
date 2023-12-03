package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 토마토7569 {
    static BufferedReader br;
    static StringTokenizer st;
    static int[][][] arr;
    static boolean[][][] visit;
    static List<int[]> list;
    static Queue<int[]> q;
    static int N;
    static int M;
    static int H;
    static int cnt; // 날짜

    // 상하좌우 층으로 상하
    static int[] dr = {-1, +1, 0, 0, 0, 0};
    static int[] dc = {0, 0, -1, +1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, +1};
    static int countZero;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken()); // 층

        arr = new int[H][N][M];
        visit = new boolean[H][N][M];
        list = new ArrayList<>(); // 1의 위치를 저장할 리스트
        q = new LinkedList<>();

        for (int h = H - 1; h >= 0; h--) {
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < M; c++) {
                    int num = Integer.parseInt(st.nextToken());
                    arr[h][r][c] = num;
                    if (num == 1) {
                        list.add(new int[]{h, r, c});
                    }
                }
            }
        }

//		System.out.println(list.get(0)[0]+" "+list.get(0)[1]);

        cnt = 0; // 날짜
        for (int h = 0; h < H; h++) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (!visit[h][r][c] && arr[h][r][c] == 1) {
                        bfs(h, r, c);
                    }
                }
            }
        }
//		for (int r = 0; r < N; r++) {
//			for (int c = 0; c < M; c++) {
//				System.out.print(arr[r][c] + " ");
//			}
//			System.out.println();
//		}

        // 다 했는데 토마토 익은게 없으면
        if (check() == 1) {
            cnt = -1;
        }

        System.out.println(cnt);

    }

    private static void bfs(int h, int row, int col) {
        // TODO Auto-generated method stub

        for (int i = 0; i < list.size(); i++) {
            q.add(new int[]{list.get(i)[0], list.get(i)[1], list.get(i)[2], 0});
            visit[list.get(i)[0]][list.get(i)[1]][list.get(i)[2]] = true;
        }

        while (!q.isEmpty()) {

            int[] peek = q.poll();

            for (int i = 0; i < 6; i++) {

                int heigt = peek[0] + dz[i];
                int R = peek[1] + dr[i];
                int C = peek[2] + dc[i];

                if (heigt >= 0 && R >= 0 && C >= 0 && R < N && C < M && heigt < H && !visit[heigt][R][C] && arr[heigt][R][C] == 0) {
                    arr[heigt][R][C] = 1;
                    q.add(new int[]{heigt, R, C, peek[3] + 1});
                    visit[heigt][R][C] = true;
                }
            }

            cnt = peek[3];

        }

    }

    static int check() {

        for (int h = H - 1; h >= 0; h--) {
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    if (arr[h][r][c] == 0) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

}
