package sw역량테스트.D1;

import java.util.Scanner;

public class 더블더블2019 {
    public static void main(String[] args) {

        //1부터 주어진 횟수까지 2를 곱한 값들을 출력하시오

        Scanner sc = new Scanner(System.in);

        double num = sc.nextInt();
        double a = 2;
        for (double i = 0; i<=num; i++){
            System.out.print((int) Math.pow(a,i) + " ");
        }

        int num1 = sc.nextInt();
        int b = 1;
        System.out.print(1+" ");
        for (int j = 1; j<=num1; j++){
            b = b *2;
            System.out.print(b + " ");
        }


    }
}
