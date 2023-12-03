package sw역량테스트.D2;

import java.util.Scanner;

public class 스토크검증 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            int[][] arr = new int[9][9];

            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            //스토쿠에서 입력받은 값을 하나빼서 count에 넣는다
            //카운트배열에 없는거면 1~9까지 없는거기에 스도쿠x

            boolean judge = true;

            //행에서 검사
            for (int r = 0; r < 9; r++) {
                int[] count = new int[9];
                for (int c = 0; c < 9; c++) {
                    count[(arr[r][c] - 1)]++;
                }
                //행마다 검사
                for (int c = 0; c < 9; c++) {
                    if (count[c] == 0) {
                        judge = false;
                        break;
                    }
                }

            }

            //열검사
            for (int c = 0; c < 9; c++) {
                int[] count = new int[9];
                for (int r = 0; r < 9; r++) {
                    count[(arr[r][c] - 1)]++;
                }
                //행마다 검사
                for (int r = 0; r < 9; r++) {
                    if (count[r] == 0) {
                        judge = false;
                        break;
                    }
                }

            }

            //3*3 검사 돌아다니면서 무조건 3칸씩 중복없이
            //9개를 검사해야하니깐 6까지 돌면서 +3씩

            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    int[] count = new int[9];
                    for (int r = i; r < i + 3; r++) {
                        for (int c = j; c < j + 3; c++) {
                            count[(arr[r][c] - 1)]++;
                        }
                    }
                    //격자다하고나서 확인
                    for (int a = 0; a < 9; a++) {
                        if (count[a] == 0) {
                            judge = false;
                            break;
                        }

                    }
                }
            }
            if (judge) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }

        }
    }
}