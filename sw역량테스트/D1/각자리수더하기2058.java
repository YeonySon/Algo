package sw역량테스트.D1;

import java.util.Scanner;

public class 각자리수더하기2058 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < 5; i++) {

            sum += num % 10;
            num = num / 10;

            System.out.println(num);

        }
        System.out.println(sum);


    }
}
