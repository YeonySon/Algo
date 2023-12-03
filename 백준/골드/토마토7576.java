package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토7576 {
    static BufferedReader br;
    static StringTokenizer st;
    static int[][] arr;
    static boolean[][] visit;
    static List<int[]> list;
    static Queue<int[]> q;
    static int N;
    static int M;
    static int cnt; // 날짜

    // 상하좌우
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};
    static int countZero;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new boolean[N][M];
        list = new ArrayList<>(); // 1의 위치를 저장할 리스트
        q = new LinkedList<>();

        countZero = 0;

        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; c++) {
                int num = Integer.parseInt(st.nextToken());
                arr[r][c] = num;
                if (num == 1) {
                    list.add(new int[]{r, c});
                }

                if (num == 0)
                    countZero++;

            }
        }

//		System.out.println(list.get(0)[0]+" "+list.get(0)[1]);

        cnt = 0; // 날짜
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (!visit[r][c] && arr[r][c] == 1) {
                    bfs(r, c);
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

    private static void bfs(int row, int col) {
        // TODO Auto-generated method stub

        for (int i = 0; i < list.size(); i++) {
            q.add(new int[]{list.get(i)[0], list.get(i)[1], 0});
            visit[list.get(i)[0]][list.get(i)[1]] = true;
        }

        while (!q.isEmpty()) {

            int[] peek = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = peek[0] + dr[i];
                int C = peek[1] + dc[i];

                if (R >= 0 && C >= 0 && R < N && C < M && !visit[R][C] && arr[R][C] == 0) {
                    arr[R][C] = 1;
                    q.add(new int[]{R, C, peek[2] + 1});
                    visit[R][C] = true;
                }
            }

            cnt = peek[2];

        }

    }

    static int check() {

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (arr[r][c] == 0) {
                    return 1;
                }
            }
        }
        return 0;
    }

}
