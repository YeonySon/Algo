package 백준.실버;

import java.util.Scanner;

public class 가장긴증가하는부분수열11053 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();


        // 어떠한 수가 있다고 생각하고 그 수 왼쪽에 있는 증가하는부분수열 중 최대값 찾고
        // 거기에 +1을 해준값이 어떠한 수의 가장 긴 증가하는 부분수열이 된다.

        int[] dp = new int[N]; // 가장 긴 증가하는 부분수열 개수 저장할 dp배열 생성

        for(int i=0; i<N; i++){


            for(int j=0; j<i; j++){

            }
        }





    }
}
