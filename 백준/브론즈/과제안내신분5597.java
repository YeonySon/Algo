package 백준.브론즈;

import java.util.Scanner;

public class 과제안내신분5597 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[31];

        for(int i=1; i<=28; i++){

            int a = sc.nextInt();
            arr[a]++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=30; i++){
            if(arr[i]==0)
                sb.append(i).append("\n");
        }
        System.out.println(sb);


    }
}
