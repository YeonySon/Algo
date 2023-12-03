package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int[] count = new int[1001];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i]%42]++;
        }

        int num = 0;
        for(int i=0; i<count.length; i++){
            if(count[i]!=0)
                num++;
        }
        System.out.println(num);


    }
}
