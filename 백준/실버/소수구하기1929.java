package 백준.실버;

import java.util.Scanner;

public class 소수구하기1929 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[1000001];

        for(int i=2; i<=1000000; i++) {
            arr[i] = i;
        }
        arr[1]=0;//1은 소수가 아니므로

        for(int i=2; i<=1000000; i++) {
            if(arr[i]==0) continue; // 스킵
            //자기 자신 빼고 배수들 0으로 초기화
            for(int j=2*i; j<=1000000; j+=i) {
                arr[j]=0;
            }
        }

        for(int i=a; i<=b; i++) {
            if(arr[i]!=0) {
                System.out.println(i);
            }
        }


    }

}
