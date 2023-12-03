package sw역량테스트.D2;

import java.util.Scanner;

public class 백만장자 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){

            int N = sc.nextInt();
            long[] arr = new long[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();

            //뒤에서부터 보자
            //만약 최대값보다 작으면 구매 그리고 나보다 큰 최대값 발견하면
            //바꿔주고 실행
            long max = 0;
            long cost = 0;
            for(int i=N-1; i>=0; i--){

                if(max>arr[i]){
                    cost += (max-arr[i]);
                } else {
                    max = arr[i];
                }
            }
            System.out.println("#"+tc+" "+cost);


        }


    }
}
