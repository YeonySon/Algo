package 모의역량테스트복기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        char[] arr = word.toCharArray();

        String result = "";
        for(int i=0; i<arr.length; i++){

            // 소문자 일 경우
            if (Character.isLowerCase(arr[i])){
                char tmp = Character.toUpperCase(arr[i]);
                result += tmp;
            }
            // 대문자 일 경우
            else {
                char tmp = Character.toLowerCase(arr[i]);
                result += tmp;

            }
        }
        System.out.println(result);


    }
}
