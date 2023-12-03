package 백준.골드;


import java.util.Arrays;
import java.util.Scanner;

public class 주사위굴리기14499 {

    // 1~6 의 동 서 북 남에 어떤 수가 있는지
    // 1부터 시작할거므로 0번째 비워두기
    static int[][] dice = {

            {},
            // 동 서 북 남
            {0, 4, 3, 5, 2}, // 1부터 0
            {0, 4, 3, 1, 6}, // 2 0
            {0, 6, 1, 5, 2}, // 3
            {0, 2, 5, 6, 1}, // 4
            {0, 4, 3, 6, 1}, // 5 0
            {0, 4, 3, 2, 5}  // 6 0
    };

    static int[][] arr = new int[7][2]; // 주사위 밑에 있을 때 숫자담기용

    // 동 서 북 남
    static int[] dr = {0, 0, 0, -1, +1};
    static int[] dc = {0, +1, -1, 0, 0};

    public static void main(String[] args) {

        arr[1][1] = 6; // 1과 6은 위 아래 바라보고 있다
        arr[6][1] = 1; // 1과 6은 위 아래 바라보고 있다

        arr[2][1] = 5; // 2와 5는 위 아래
        arr[5][1] = 2;

        arr[3][1] = 4; // 3과 4는 위 아래
        arr[4][1] = 3;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열

        int[][] map = new int[N][M];

        int R = sc.nextInt();
        int C = sc.nextInt();

        int K = sc.nextInt(); // 명령어 개수

        // 지도 받기
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                map[r][c] = sc.nextInt();
            }
        }

        // 명렁어 받기

        int num = 1; // 첨 주사위 시작은 맨 위가 1일 때 시작

        int tmp = 0;

        for (int order = 1; order <= K; order++) {

            int dir = sc.nextInt();

            // 주사위 움직일건데 일단 지도 범위 안에 있어야해

            R += dr[dir];
            C += dc[dir];

            if (R >= 0 && C >= 0 && R < N && C < M) {

                if (tmp == 1 || tmp == 2)
                    dir = (dir + 2) % 4;


                // 이동한 곳의 지도위치가 0 이면 주사위 바닥면이 지도로 복사
                if (map[R][C] == 0) {

                    int top = dice[num][dir]; // 주사위 맨 위
                    System.out.println(arr[top][0]);

                    int bottom = arr[top][1]; // 주사위 밑
//                    System.out.println("맨위에요-> " + top + " / 밑이에요 -> " + bottom);
                    map[R][C] = arr[bottom][0];

//                    for(int i=1; i<=6; i++) {
//                        System.out.print(arr[i][0]+" ");
//                    }

                }

                // 이동한 곳의 지도위치가 0이 아니면 주사위 바닥면으로 복사되고 지도위치는0
                else {

                    int top = dice[num][dir]; // 주사위 맨 위
                    System.out.println(arr[top][0]);

                    int bottom = arr[top][1]; // 주사위 밑
//                    System.out.println("맨위에요-> " + top + " / 밑이에요 -> " + bottom);
                    arr[bottom][0] = map[R][C];
                    map[R][C] = 0;

//                    for(int i=1; i<=6; i++) {
//                        System.out.print(arr[i][0]+" ");
//                    }

                }

                // 다 끝나면 맨위 숫자 갱신
                num = dice[num][dir];

                if (dir == 1 || dir == 2)
                    tmp = dir;


            }

        }


    }

}