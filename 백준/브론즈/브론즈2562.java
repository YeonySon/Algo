package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브론즈2562 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int count = 0;
        int index = 0;
        for (int i=0; i<arr.length; i++){
            count++;
            if (arr[i]>max){
                max = arr[i];
                index = count;
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(index);

    }
}
