package 백준.브론즈;

import java.util.Scanner;

public class 브론즈10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        int num = sc.nextInt();
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }



        for (int i =0; i<size; i++){
            if (num>arr[i])
                System.out.print(arr[i] + " ");
        }




    }
}
