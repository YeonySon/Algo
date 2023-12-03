package 백준.브론즈;

import java.util.Scanner;

public class 공넣기10810 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];

        for(int i=0; i<M; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();


            for(int k=a; k<=b; k++){
                arr[k] = v;
            }

        }

        for(int i=1; i<=N; i++)
            System.out.print(arr[i] + " ");


    }
}
