package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class N과M6 {
    //조합
    static int[] arr;
    static int[] result;
    static int N;
    static int M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        result = new int[M];

        combi(0,0);

    }

    private static void combi(int idx, int cnt) {

        if(idx==M){

            for(int num : result){
                System.out.print(num + " ");
            }
            System.out.println();

            return;
        }


        for(int i=cnt; i<N; i++){
            result[idx] = arr[i];
            combi(idx+1, i+1);
        }



    }

}
