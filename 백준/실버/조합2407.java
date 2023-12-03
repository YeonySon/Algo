package 백준.실버;

import java.math.BigInteger;
import java.util.Scanner;

public class 조합2407 {
    public static void main(String[] args) {

        // nCm
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = sc.nextInt();

        // 조합은
        // 예를 들어 5c2는 5*4 / 2*1 이다
        BigInteger up = BigInteger.ONE;
        BigInteger down = BigInteger.ONE;

        int idx = 0;
        while(idx<r){

            up = up.multiply(BigInteger.valueOf(num-idx));
            down = down.multiply(BigInteger.valueOf(r-idx));
            idx++;
        }
        BigInteger result = up.divide(down);
        System.out.println(result);
    }
}
