package 백준.브론즈;

import java.util.Scanner;

public class 오와육의차이2864 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String max1 = "";
        String min1 = "";
        String max2 = "";
        String min2 = "";

        // num1에서 5나 6이 있을때
        for (int i = 0; i < num1.length(); i++) {

            if (num1.charAt(i) == '5' || num1.charAt(i) == '6') {
                max1 += "6";
                min1 += "5";
            } else {
                max1 += num1.charAt(i);
                min1 += num1.charAt(i);
            }
        }

        // num2
        for (int i = 0; i < num2.length(); i++) {

            if (num2.charAt(i) == '5' || num2.charAt(i) == '6') {
                max2 += "6";
                min2 += "5";
            } else {
                max2 += num2.charAt(i);
                min2 += num2.charAt(i);
            }
        }

        int max = Integer.parseInt(max1) + Integer.parseInt(max2);
        int min = Integer.parseInt(min1) + Integer.parseInt(min2);

        System.out.println(min + " " + max);

    }
}
