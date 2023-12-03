package 백준.골드;

import java.util.Scanner;

public class 스도쿠2580 {
    static Scanner sc;
    static int N = 9;
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        arr = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
        dfs(0, 0);

    }

    private static void dfs(int row, int col) {

        if (col == 9) {
            dfs(row + 1, 0); // 그 다음 행
            return;
        }

        if (row == 9) {
            // 끝까지 다 돈거니깐
            // 그 결과값 출력
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    System.out.print(arr[r][c] + " ");
                }
                System.out.println();
            }
            System.exit(0); // 계속 에러나길래 찾아보니 만족하는 값 찾을경우 1가지의 경우만 출력하면되므로 종료시켜야한다

        }

        if (arr[row][col] == 0) {

            //1~9까지 하나씩 넣어보면서 0인 자리에서 스도쿠 만족하는지 체크하기
            for (int i = 1; i <= 9; i++) {
                if (check(row, col, i)) {
                    arr[row][col] = i;
                    dfs(row, col + 1); // 다음열 올려주기
                }
            }
            arr[row][col] = 0; // 스도쿠를 못 만든다면 0으로 하고 리턴
            return;
        }
        dfs(row, col + 1);

        // 0 인 곳이 아닌 경우


    }

    private static boolean check(int row, int col, int i) {

        // 열
        for (int c = 0; c < 9; c++) {
            // dfs에서 체크하는 숫자가 있으면 이미 스도쿠에 있는것이므로 false리턴
            if (arr[row][c] == i)
                return false;
        }

        // 행
        for (int r = 0; r < 9; r++) {
            if (arr[r][col] == i)
                return false;
        }

        // 3x3

        int tmpRow = (row / 3) * 3;
        int tmpCol = (col / 3) * 3;

        for (int r = tmpRow; r < tmpRow + 3; r++) {
            for (int c = tmpCol; c < tmpCol + 3; c++) {
                if (arr[r][c] == i)
                    return false;
            }
        }


        // 여기위의 체크들에서 안 걸렸다? 그럼 그 숫자는 없는거이므로
        // 0인 값에다가 집어넣어야한다

        return true;
    }
}
