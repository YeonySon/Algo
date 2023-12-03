package sw역량테스트.D1;

import java.util.Scanner;

public class 큰놈작은놈같은놈2070 {
    public static void main(String[] args) {

        //2개의 수를 입력받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램 작성

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int tc = 1; tc <= T; tc++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a==b){
                System.out.println("#" + tc + " " + "=");
            } else if (a>b){
                System.out.println("#" + tc + " " + ">");
            } else {
                System.out.println("#" + tc + " " + "<");

            }


        }

    }
}
