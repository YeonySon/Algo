package 백준.실버;

import java.util.Scanner;

public class 빙고2578 {
    static int[][] arr = new int[5][5];
    static int bingo = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

//        for(int r=0; r<5; r++){
//            for(int c=0; c<5; c++){
//                System.out.print(arr[r][c]+" ");
//            }
//            System.out.println();
//        }


        //총 25번의 숫자를 부를 수 있다
        for (int i = 1; i <= 25; i++) {
            int num = sc.nextInt();
            //사회자가 부른 번호가 같은걸 찾고 그걸 표시하기 위해 100으로 초기화
            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (arr[r][c] == num) {
                        arr[r][c] = 100;
                    }
                }
            }

            //행체크
            rowCheck();

            //열체크
            colCheck();

            //오른대각선체크
            rDagak();

            //왼대각선체크
            lDagak();


            if (bingo >= 3) {
                System.out.println(i);
                break;
            } else{
                bingo = 0;
            }
        }
    }

    private static void lDagak() {
        int check = 0;
        // +1 +1
        for (int i = 0; i <= 4; i++) {
            if (arr[0 + (i * 1)][0 + (i * 1)] == 100)
                check++;
        }

        if (check == 5)
            bingo++;
    }

    private static void rDagak() {
        int check = 0;
        // +1 -1
        for (int i = 0; i <= 4; i++) {
            if (arr[0 + (i * 1)][4 + (-1 * i)] == 100)
                check++;
        }

        if (check == 5)
            bingo++;
    }

    private static void colCheck() {

        for (int c = 0; c < 5; c++) {
            int check = 0;
            for (int r = 0; r < 5; r++) {
                if (arr[r][c] == 100)
                    check++;
            }
            if (check == 5)
                bingo++;
        }
    }

    private static void rowCheck() {
        for (int r = 0; r < 5; r++) {
            int check = 0;
            for (int c = 0; c < 5; c++) {
                if (arr[r][c] == 100)
                    check++;
            }
            if (check == 5)
                bingo++;
        }
    }
}
