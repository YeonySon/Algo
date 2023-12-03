package 백준.브론즈;

import java.util.Scanner;

public class 브론즈2525 {
    public static void main(String[] args) {
        //오븐시계 시계 플러스

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int plusMin = sc.nextInt();
        int lastMin = min + plusMin;

        int count = 0;
        while (lastMin>=60){
                lastMin = lastMin - 60;
                count++;
                }
        int lastHour = hour +count;

        if (lastHour>=24){
            lastHour = lastHour-24;
        }

        System.out.println(lastHour + " " + lastMin);


    }
}
