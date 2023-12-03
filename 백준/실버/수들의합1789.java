package 백준.실버;

import java.util.Scanner;

public class 수들의합1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        long sum = 0;
        long cnt = 0;

        int idx = 1;
        while (num != sum){
            sum += idx;
            if(sum > num){
                break;
            }
            idx++;
        }

        System.out.println(idx-1);

    }
}
