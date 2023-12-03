package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단지번호붙이기2667 {
    static BufferedReader br;
    static int N;
    static int[][] arr;
    static boolean[][] visit;
    static int cnt;
    static Queue<int[]> q = new LinkedList<>();
    static int apartment;
    static List<Integer> list = new ArrayList<>();

    //4방 상 하 좌 우
    static int[] dr = {-1, +1, 0, 0};
    static int[] dc = {0, 0, -1, +1};

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 크기

        arr = new int[N][N];
        visit = new boolean[N][N];

        //넣어주자
        for (int r = 0; r < N; r++) {
            String str = br.readLine();
            for (int c = 0; c < N; c++) {
                arr[r][c] = str.charAt(c) - '0';
            }
        }

        cnt = 0;
        // 1 대장들 찾자
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (!visit[r][c] && arr[r][c] == 1) {
                    apartment = 1; // 단지내집의수
                    bfs(r, c);
                    cnt++; // 단지수
                    list.add(apartment); // 리스트에 넣어주고나서 오름차순으로 정렬하자
                }
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for (int num : list) {
            System.out.println(num);
        }
    }

    //너비탐색
    private static void bfs(int row, int col) {

        q.offer(new int[]{row, col});
        visit[row][col] = true;

        while (!q.isEmpty()) {

            int[] peek = q.poll();

            for (int i = 0; i < 4; i++) {

                int R = peek[0] + dr[i];
                int C = peek[1] + dc[i];


                // 범위 벋어나지 않고 방문한적없고 값이 1인경우
                if (R >= 0 && C >= 0 && R < N && C < N && !visit[R][C] && arr[R][C] == 1) {
                    q.add(new int[]{R, C});
                    visit[R][C] = true;
                    apartment++;
                }
            }
        }
    }
}
