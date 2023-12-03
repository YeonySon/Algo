package 백준.골드;

import java.util.Scanner;

public class 플로이드워셜11404 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 도시개수

        int[][] arr = new int[N][N];
        int INF = 100000001;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (r != c)
                    arr[r][c] = INF;
            }
        }


        int M = sc.nextInt(); // 도시정보수
        for (int i = 1; i <= M; i++) {

            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int v = sc.nextInt();

            arr[a][b] = Math.min(arr[a][b], v);
        }

        // a to b 사이에 하나씩 집어넣으면서 최소거리 있으면
        // a to b 값 갱신해주자

        // 경유지
        for (int mid = 0; mid < N; mid++) {
            // 시작지점
            for (int a = 0; a < N; a++) {
                if (a == mid) continue;
                // 도착지점
                for (int b = 0; b < N; b++) {
                    if (a == b || b == mid) continue;
                    arr[a][b] = Math.min(arr[a][b], arr[a][mid] + arr[mid][b]);
                }
            }
        }

        // 출력
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                if (arr[r][c] == INF)
                    arr[r][c] = 0;

                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }


    }
}
