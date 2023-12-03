package sw역량테스트.D2;

import java.util.Arrays;
import java.util.Scanner;

public class 중간평균값구하기1984 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc=1; tc<=t; tc++){

            int [] arr = new int[10];

            for(int i=0; i<10; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            double total = 0;
            for(int i=1; i<9; i++){
                total += arr[i];
            }

            System.out.println("#"+tc+ " " + (int) Math.round(total/8) );

        }
    }
}
