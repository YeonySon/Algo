package sw역량테스트.D1;

import java.util.Scanner;

public class 홀수만더하기2072 {
    public static void main(String[] args) {
        //각각 10개의 수를 입력받아 홀수만 더하기

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for (int tc = 1; tc<=T; tc++){

            int[] array = new int[10];
            int sum = 0;
            for (int i = 0; i<array.length; i++){
                array[i] = sc.nextInt();

                if ((array[i]%2)!=0){
                    sum += array[i];
                }

            }
            System.out.println("#"+tc + " " + sum);


        }

    }
}
