package sw역량테스트.D2;

import java.util.Scanner;

public class 수도요금경쟁1284 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++){

            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int s = sc.nextInt();
            int w = sc.nextInt();

            int a = p * w;
            int b = 0;
            if (r>w){
               b = q;
            } else {
                b=(q*r)+(w-r)*s;
            }

            if (a>b){
                System.out.println("#"+tc + " " + b);
            } else {
                System.out.println("#"+tc + " " + a);
            }
        }
    }
}
