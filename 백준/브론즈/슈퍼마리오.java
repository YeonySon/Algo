package 백준.브론즈;

import java.util.Arrays;
import java.util.Scanner;

public class 슈퍼마리오 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i]=sc.nextInt();
        }

        int[] plus = Arrays.copyOf(arr,10);
        int[] abs = new int[10]; // 100과의 차이 저장할 배열
        abs[0] = Math.abs(plus[0]-100);
        for(int i=1; i<10; i++){
            plus[i]+=plus[i-1];
            abs[i] = Math.abs(plus[i]-100);
        }

        int idx = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<10; i++){
            if(abs[i]<=min){
                min=abs[i];
                idx = i;
            }
        }

        System.out.println(plus[idx]);





        //100가장 가깝게 혹 98 102 면 큰 값을 출력



    }
}
