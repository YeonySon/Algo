package 백준.브론즈;

import java.util.Scanner;

public class 브론즈2884 {
    public static void main(String[] args) {
        //시계 45분전으로 표시

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        int newMin = min-45;

        if (newMin<0){
            newMin = 60 + newMin;
            if (hour==0){
                hour = 24;
            }
            hour = hour -1;
            System.out.println(hour + " " + newMin);
        } else {
            System.out.println(hour + " " + newMin);
        }


    }
}
