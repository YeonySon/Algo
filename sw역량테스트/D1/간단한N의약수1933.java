package sw역량테스트.D1;

import java.util.Scanner;

public class 간단한N의약수1933 {

    // 입력받은 값으로 약수를 구하는데 오름차순 10

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i<=num; i++){
            if (num%i == 0){
                System.out.print(i+" ");
            }
        }


    }



}
