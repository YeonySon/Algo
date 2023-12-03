package 백준.브론즈;

import java.util.Scanner;

public class 공바꾸기10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++)
            arr[i] = i;


        for(int i=0; i<M; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            swap(a,b,arr);

        }

        for(int i=1; i<=N; i++)
            System.out.print(arr[i] + " ");


    }

    static void swap(int a, int b, int[] arr){

        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }

}
