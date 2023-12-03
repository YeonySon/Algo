package 백준.실버;

import java.util.Scanner;
import java.util.Stack;

public class 분수찾기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a = 0;

        for (int i = 1; i <= 10000000; i++) {

            int check = (i * (i - 1) + 2) / 2;

            if (check > N) {
                a = --i;
                break;
            }
        }

        int start = (a * (a - 1) + 2) / 2;
        int diff = N - start;

        if (a % 2 == 0) {
            // 짝수일때는 오른쪽대각선위로
            int front = 1 + diff;
            int behind = a - diff;


            System.out.println(front + "/" + behind);

        } else {
            // 홀수일때는 짝수랑 반대
            int front = a - diff;
            int behind = 1 + diff;

            System.out.println(front + "/" + behind);
        }


    }
}