package 백준.실버;

import java.util.Scanner;

public class 색종이만드리2630 {
    static Scanner sc;
    static int[][] arr;
    static int white;
    static int blue;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int N = sc.nextInt(); // 색종이 한변의 길이
        arr = new int[N][N];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }
        white = 0;
        blue = 0;
        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    private static void partition(int row, int col, int part) {

        if (check(row, col, part)) {

            if (arr[row][col] == 0)
                white++;
            else
                blue++;

            return;
        }

        int nextPart = part / 2; // 4등분으로 나누는 색종이 크기

        partition(row, col, nextPart); // 왼쪽
        partition(row + nextPart, col, nextPart); // 왼쪽아래
        partition(row, col + nextPart, nextPart); // 새로운 색종이변만큼 열에 더해주면 오른쪽
        partition(row + nextPart, col + nextPart, nextPart); // 오른쪽아래

    }

    private static boolean check(int row, int col, int part) {

        int check = arr[row][col]; // 탐색하는 첫번째놈을 check라는 변수에 담아두고 그거랑 같은지? 아니면 다른지로 색깔 구별
        // 그래서 지금 나눈 색종이가 색깔이 같은지 아니면 다시 나누어야하니깐

        for (int i = row; i < row + part; i++) {
            for (int j = col; j < col + part; j++) {
                if (arr[i][j] != check)
                    return false;
            }
        }
        return true;
    }
}
