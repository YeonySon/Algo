package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class 다리놓기1010 {
    static int[] arr;
    static int T;
    static int N;
    static int M;
    static boolean[] visit;
    static int cnt;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        T = sc.nextInt(); // 테스트케이스

        for(int tc=1; tc<=T; tc++){

            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[M];
            visit = new boolean[M];

            //조합
            cnt = 0;
            combi(0,N,M);
            System.out.println(cnt);



        }


    }

    static void combi(int depth, int n, int m){

        if(n==0){
            cnt++;
//            System.out.println(Arrays.toString(visit));
            return;
        }

        for(int i=depth; i<m; i++){
            visit[i] = true;
            combi(i+1,n-1,m); // 하나뽑았으니 총 필요한 자리수에서 -1해준다
            visit[i] = false;
        }


    }

}
