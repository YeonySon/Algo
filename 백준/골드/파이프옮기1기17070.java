package 백준.골드;

import java.util.Scanner;

public class 파이프옮기1기17070 {
    static Scanner sc;
    static int N;
    static int[][] arr;
    static int cnt; // 경우의 수

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt(); // 배열크기
        arr = new int[N][N];

        // 지도를 넣자
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }


        cnt = 0; // 경우의수
        // 파이프는 끝에만 보면 되므로 우리는 0,1을 기준으로 시작하자
        // 방문체크를 할 필요 없다
        dfs(0, 1, 1); // 처음에 가로부터 시작하므로 방향상태 변수하나 추가해주자
        System.out.println(cnt);


    }

    private static void dfs(int row, int col, int dir) {

        // 범위를 벋어나지 않을 때
        if (row >= 0 && col >= 0 && row < N && col < N) {

            // 다 도착했으면 경우의 수 추가해주고 return
            if (row == N - 1 && col == N - 1) {
                cnt++;
                return;
            }

            // 가로인 경우
            if (dir == 1 || dir == 3) {
                if (col + 1 < N && arr[row][col + 1] == 0)
                    dfs(row, col + 1, 1);
            }

            //세로인 경우
            if (dir == 2 || dir == 3) {
                if (row + 1 < N && arr[row + 1][col] == 0)
                    dfs(row + 1, col, 2);

            }

            //대각선인 경우
            if (row + 1 < N && col + 1 < N && arr[row][col + 1] == 0 && arr[row + 1][col] == 0 && arr[row + 1][col + 1] == 0) {
                dfs(row + 1, col + 1, 3);
            }


        }


    }

}
