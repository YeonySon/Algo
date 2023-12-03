package 백준.브론즈;

import java.util.Scanner;

public class 단어공부1157 {
    static Scanner sc;
    static int[] arr;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        arr = new int[26];
        String line = sc.next();
        String str = line.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i])
                count++;
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println((char) (idx + 65));
        }


    }

}
