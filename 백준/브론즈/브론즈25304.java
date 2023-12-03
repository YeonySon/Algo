package 백준.브론즈;

import java.util.Scanner;

public class 브론즈25304 {
    public static void main(String[] args) {
        //영수증 문제로 예상금액 입력받아 물건값 개수랑 곱한게 같은지 판단
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int t = sc.nextInt();
        int total = 0;
        for (int tc=1; tc<=t; tc++){

            int price = sc.nextInt();
            int count = sc.nextInt();

            int pr = price*count;

            total += pr;
        }
        if (limit==total){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
