package 백준.브론즈;

import java.util.Scanner;

public class 숫자의개수2577 {
    static Scanner sc;
    static int[] arr;


    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = num1 * num2 * num3;
        arr = new int[10];
        String str = String.valueOf(result);

        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)-'0']++;
        }

        for(int num : arr)
            System.out.println(num);


    }
}
