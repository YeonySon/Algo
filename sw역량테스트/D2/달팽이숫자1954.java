package sw역량테스트.D2;

import java.util.Arrays;
import java.util.Scanner;

public class 달팽이숫자1954 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int tc=1; tc<=t; tc++){

            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int count = 1;

            for(int r=0; r<N-1; r++){
                for(int c=0; c<N; c++){
                    arr[r][c] = count++;

                    if (c==N-1){
                        arr[r+1][N-1]=count++;
                    }

                }
            }




        }



    }
}
