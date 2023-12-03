package 백준.브론즈;

import java.util.Scanner;

public class 브론즈3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int quen = 1;
        int look = 2;
        int beshop = 2;
        int knight = 2;
        int pone = 8;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();


        System.out.println((king-a) + " " + (quen-b) + " " + (look-c) + " " + (beshop-d) + " " + (knight-e) + " " + (pone-f) );





    }
}
