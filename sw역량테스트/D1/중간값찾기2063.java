package sw역량테스트.D1;

import java.util.Arrays;
import java.util.Scanner;

public class 중간값찾기2063 {
    public static void main(String[] args) {

        //입력받은 값으로 배열크기 정하고 점수들 배열에서 중간값 찾기

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] array = new int[a];
        int result = 0;


        for (int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();

        }
        Arrays.sort(array);
        if (a%2!=0){
            result = array[(array.length)/2];

        }
        System.out.println(result);

    }
}
