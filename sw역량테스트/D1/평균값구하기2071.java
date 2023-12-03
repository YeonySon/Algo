package sw역량테스트.D1;

import java.util.Scanner;

public class 평균값구하기2071 {
    public static void main(String[] args) {

        //각각 10개 수를 입력받아 평균값 출력(소수점 첫번째 자리에서 반올림한 정수)

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int tc = 1; tc <=T; tc++){

            int[] array = new int[10];
            double sum = 0;
            for (int i = 0; i<array.length; i++){
                array[i] = sc.nextInt();
                sum += array[i];
            }

            int result = (int) (Math.round(sum/array.length));

            System.out.println("#" + tc + " " + result);
        }


    }
}
