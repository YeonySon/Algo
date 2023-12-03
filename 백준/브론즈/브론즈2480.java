package 백준.브론즈;

import java.util.Scanner;

public class 브론즈2480 {
    public static void main(String[] args) {

        //주사위 같으면 문제

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = Math.max(a,b);
        int max = Math.max(d,c);

        if (a==b && b==c){
            System.out.println(10000+(a*1000));
        } else if (a==b || a==c){
            System.out.println(1000+(a*100));
        } else if (b==c) {
            System.out.println(1000+(b*100));
        } else {
            System.out.println(max*100);
        }


    }
}
