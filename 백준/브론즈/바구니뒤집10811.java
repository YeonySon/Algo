package 백준.브론즈;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 바구니뒤집10811 {
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

            int last = b;
            int start = a;

            int[] copy = Arrays.copyOf(arr, N + 1);


            for(int k=a; k<=b; k++){

                arr[k] = copy[last];
                last--;
            }

        }

        for(int i=1; i<=N; i++)
            System.out.print(arr[i]+" ");

    }

}
