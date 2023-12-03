package 백준.실버;

import java.io.IOException;
import java.util.Scanner;

public class 곱셈1629 {

    static long num;
    static long d;

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        num = sc.nextLong(); // 숫자
        int p = sc.nextInt(); // 몇번 곱할지
        d = sc.nextLong(); // 나눌수

        long result = half(num, p);

        System.out.println(result);

    }

    private static long half(long number, int p) {


        if (p == 1) {
            return (number % d);
        }


        long divide = half(number, p/2);


        // 지수가 짝수면
        if (p % 2 == 0) {
            return (divide % d) * (divide % d) % d;
        }
        // 지수가 홀수면
        else {
            return (((divide % d) * (divide % d) % d) * (number % d)) % d;
        }

    }

}