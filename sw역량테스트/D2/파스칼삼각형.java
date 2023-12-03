package sw역량테스트.D2;

import java.util.Scanner;

public class 파스칼삼각형 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int tc=1; tc<=t; tc++){

            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<=r; c++){
                    if(r==c || c==0) arr[r][c]=1;
                    else{
                        arr[r][c] = arr[r-1][c-1] + arr[r-1][c];
                    }
                }
            }


            System.out.println("#"+tc);
            for(int i=0; i<N; i++){
                for(int j=0; j<=i; j++){
                    System.out.print(arr[i][j]+"");
                }
                System.out.println();
            }




        }



    }
}
