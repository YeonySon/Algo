package 백준.브론즈;

import java.util.Scanner;

public class 브론즈2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        String[] arr1 = num1.split("");
        String[] arr2 = num2.split("");
        int sum = 0;
        int count = 0;
        for (int i =arr1.length-1; i>= 0; i--) {
            int result = Integer.parseInt(num1) * Integer.parseInt(arr2[i]);
            System.out.println(result);
            sum += result*((Math.pow(10,count)));
            count++;
        }
        System.out.println(sum);
    }
}
