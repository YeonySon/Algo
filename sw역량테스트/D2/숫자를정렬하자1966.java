package sw역량테스트.D2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자1966 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int tc=1; tc<=t; tc++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

           Arrays.sort(arr);
            System.out.print("#"+tc+" ");
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }


    }
}
