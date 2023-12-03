package sw역량테스트.D1;

import java.util.Scanner;

public class 최대수구하기2068 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {

            int[] array = new int[10];

            int maxNum = 0;
            for (int i = 0; i < array.length; i++) {

                array[i] = sc.nextInt();

                if (array[i] > maxNum) {
                    maxNum = array[i];
                }
            }
            System.out.println("#" + test_case + " " + maxNum);


        }


    }

}
