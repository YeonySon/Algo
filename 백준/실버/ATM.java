package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        //오름차순 정렬
        Arrays.sort(arr);
        
        //누적합 구하기
        //앞 사람의 시간을 더한게 내 시간
        for(int i=1; i<N; i++){
            arr[i] += arr[i-1];
        }

        int total = 0;
        for(int i=0; i<N; i++)
            total += arr[i];
        System.out.println(total);

    }
}
