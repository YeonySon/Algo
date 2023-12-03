package 백준.실버;

import java.util.Scanner;

public class 체스판칠하기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        //체스판을 한줄씩 받아서 배열에 넣어준다
        String[] chess = new String[row];
        for (int i = 0; i < row; i++) {
            chess[i] = sc.next();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                //최소 바꾸는 개수를 함수로 구현함
                int count = getCount(i, j, chess);
                
                //최솟값 구하기
                if (min > count) {
                    min = count;
                }
            }
        }
        System.out.println(min);
    }


    //
    static int getCount(int row, int col, String[] chess) {
        //체스판이 칠할 수 있는 경우가 2가지
        //흰색으로 시작 또는 검정색으로 시작
        //2*2행렬을 만들어서 생각해보면
        //한쪽이 바꾸는게 1번이면 다른쪽은 3번 이렇게 나온다

        String[] chessAns = {"WBWBWBWB",
                            "BWBWBWBW",
                            "WBWBWBWB",
                            "BWBWBWBW",
                            "WBWBWBWB",
                            "BWBWBWBW",
                            "WBWBWBWB",
                            "BWBWBWBW"};

        int whiteCount = 0; //흰색일때
        for (int i = 0; i < 8; i++) {
            int r = row + i; // 나중에 메인에서 받아온 값 적용하여 움직임
            for (int j = 0; j < 8; j++) {
                int c = col + j; // 나중에 메인에서 받아온 값 적용하여 움직임
                //chessAns랑 비교했을 때 같지 않으면 색깔을 바꿔 칠해야하는 경우
                //이므로 칠해야하는거에 추가
                //여기서는 맨왼쪽위가 흰색일 답안을 기준으로 생각
                if (chess[r].charAt(c) != chessAns[i].charAt(j)) {
                    whiteCount++;
                }
            }
        }
        //흰색일때 개수 나왔고, 총 횟수64에서 빼주면 그게
        //맨왼쪽이 검정일때를 가정으로 했을때 나오는 횟수를 나타냄
        return Math.min(whiteCount, 64 - whiteCount);


    }


}
