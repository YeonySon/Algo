package 백준.실버;

import java.util.Scanner;

public class 소수2581 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] arr = new int[end+1];

        arr[0] = 1;
        arr[1] = 1;

        //에라토스테네체
        for(int i=2; i<=end; i++){
            for(int j=i*2; j<arr.length; j+=i){
                arr[j] = 1;
            }
        }

        
        //범위안에서 과연 이게 소수인지 판단
        //소수라면 그때 total값 나오게 하고 최솟값도 비교
        int total = 0;
        int min = Integer.MAX_VALUE;
        for(int i=start; i<=end; i++){
            if(arr[i]==0){
                total += i;
                min = Math.min(min,i);
            }
        }

        if(total==0){
            System.out.println(-1);
        } else {
            System.out.println(total);
            System.out.println(min);
        }




    }
}
