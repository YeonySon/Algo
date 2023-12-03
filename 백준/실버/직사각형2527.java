package 백준.실버;

import java.util.Scanner;

public class 직사각형2527 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 4; tc++) {

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();


                //범위밖
            if (x1 > x4 || x2 < x3 || y1 > y4 || y2 < y3) {
                System.out.println("d");
                //점
            } else if ((x1 == x4 && y1 == y4) || (x1 == x4 && y2 == y3) || (x2 == x3 && y2 == y3) || (x2 == x3 && y1 == y4)) {
                System.out.println("c");

            } else if ((y1 == y4) || (y2 == y3) || (x2 == x3) || (x1 == x4)) {
                //선
                System.out.println("b");

            } else {
                //면
                System.out.println("a");
            }
        }
    }
}
