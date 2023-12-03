package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수1003 {
    static BufferedReader br;

    static int[] arr;
    static int[] arr2;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            int num = Integer.parseInt(br.readLine());
            arr = new int[40+ 1]; // 0인배열
            arr2 = new int[40 + 1]; // 1인배열

            arr[0]=1;
            arr2[0]=0;
            arr[1]=0;
            arr2[1]=1;
            for(int i=2; i<=40; i++){
                arr[i] = arr[i-2] + arr[i-1];
                arr2[i] = arr2[i-2] + arr2[i-1];
            }
            System.out.println(arr[num] + " " + arr2[num]);




        }
    }
}


