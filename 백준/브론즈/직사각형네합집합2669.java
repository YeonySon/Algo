package 백준.브론즈;

import java.util.Scanner;

public class 직사각형네합집합2669 {
    static Scanner sc;
    static int[][] arr;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        arr = new int[101][101];

        for(int tc=1; tc<=4; tc++){

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int r=y1; r<y2; r++){
                for(int c=x1; c<x2; c++){
                    arr[r][c]=1;
                }
            }
        }
        int count = 0;
        for(int r=0; r<101; r++){
            for(int c=0; c<101; c++){
                if(arr[r][c]==1)
                    count++;
            }
        }

        System.out.println(count);

    }

}
