package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class 거스름돈5585 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int money = 1000 - n;

//        int[] arr = new int[6];

        int cnt = 0;

        while (money != 0) {

            if (money >= 500) {
                money -= 500;
//                arr[0]++;
                cnt++;
            } else if (money >= 100 && money < 500) {
                money -= 100;
//                arr[1]++;
                cnt++;
            } else if (money >= 50 && money < 100) {
                money -= 50;
//                arr[2]++;
                cnt++;
            } else if (money >= 10 && money < 50) {
                money -= 10;
//                arr[3]++;
                cnt++;
            } else if (money >= 5 && money < 10) {
                money -= 5;
//                arr[4]++;
                cnt++;
            } else {
                money -= 1;
//                arr[5]++;
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}
