package sw역량테스트.D2;

import java.util.Scanner;

public class 달팽이숫자 {

    static int[][] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            arr = new int[N][N];

            //첫번째는 무조건 열끝까지 오른쪽으로진행
            //끝났으면 그 인덱스 저장했다가 밑으로 끝까지 진행
            //끝났으면 서쪽으로진행 위로진행
            //단 계속 비어있을때만 값을 넣는형태로 진행

            if (N == 1) {
                System.out.println("#" + tc);
                System.out.println(1);
                continue;
            }
            //우하좌상
            int[] dr = {0, +1, 0, -1};
            int[] dc = {+1, 0, -1, 0};

            int r = 0;
            int c = 0;
            int dir = 0; // 방향이 바뀔때마다 바꿔주기
            for (int i = 0; i < N * N; i++) {

                arr[r][c] = i + 1; // 행렬에 오름차순으로 넣어주기
                r += dr[dir];
                c += dc[dir];

                if (r < 0 || c < 0 || r >= N || c >= N) {
                    //행렬범위밖이면 방향바꾸기
                    //범위밖으로 나갔으므로 다시 한칸전으로 돌려놓기
                    r = r - dr[dir];
                    c = c - dc[dir];

                    //방향바꾸기
                    dir = (dir + 1) % 4;

                    r += dr[dir];
                    c += dc[dir];
                }

                //넣고자하는 행렬에 값이 있으면 또 다시 방향전환
                if (arr[r][c] != 0) {

                    r = r - dr[dir];
                    c = c - dc[dir];

                    //방향바꾸기
                    dir = (dir + 1) % 4;

                    r += dr[dir];
                    c += dc[dir];
                }
            }

            System.out.println("#" + tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }

        //출력용 함수
//    static void print(int N) {
//        for (int r = 0; r < N; r++) {
//            for (int c = 0; c < N; c++) {
//                System.out.print(arr[r][c]);
//            }
//            System.out.println();
//        }
//    }

    }
}