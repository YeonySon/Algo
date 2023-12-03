package 백준.브론즈;

import java.math.BigInteger;
import java.util.Scanner;

public class 엄청난부자21271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger num = a.divide(b);
        BigInteger remain = a.remainder(b);
        System.out.println(num);
        System.out.println(remain);

    }

}
