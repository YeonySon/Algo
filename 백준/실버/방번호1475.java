package 백준.실버;

import java.util.Scanner;

public class 방번호1475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[10]; // 0~9까지가 한 세트


        for (int i = 0; i < str.length(); i++) {

            int num = str.charAt(i)-'0';
            if (num == 6) {
                arr[9]++;
            } else{
                arr[num]++;
            }
        }

        int tmp = arr[9];
        if(tmp%2==1){
            arr[9] = tmp/2 + 1;
        } else {
            arr[9] = tmp/2;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<10; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);



    }
}
