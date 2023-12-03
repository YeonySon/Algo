package 백준.브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class N찍기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String str = sc.next();

       int[] arr = new int[26];
       Arrays.fill(arr, -1);

       for(int i=0; i<str.length(); i++){

           if(arr[str.charAt(i)-'a'] > -1) continue;

           arr[str.charAt(i)-'a']=i;
       }

        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
