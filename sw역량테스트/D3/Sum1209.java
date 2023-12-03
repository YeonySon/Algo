package sw역량테스트.D3;

import java.util.Scanner;

public class Sum1209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[100][100];
        for (int tc=1; tc<=10; tc++){
            int testNum = sc.nextInt();

            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;//max저장

            //가로total
            for(int i=0; i<100; i++){
                int widthTotal = 0;
                for(int j=0; j<100; j++){
                    widthTotal += arr[i][j];
                }
                max = Math.max(max,widthTotal);
            }

            //세로total
            for(int i=0; i<100; i++){
                int heightTotal = 0;
                for (int j=0; j<100; j++){
                    heightTotal += arr[j][i];
                }
                max = Math.max(max,heightTotal);
            }

            //대각선
            int rDiagonal = 0;
            int lDiagonal = 0;
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    if (i==j){
                        rDiagonal+=arr[i][j];
                        lDiagonal+=arr[99-i][j];
                    }
                }
            }
            Math.max(max,rDiagonal);
            Math.max(max,lDiagonal);

            System.out.println("#"+testNum+" "+max);

        }



    }
}
