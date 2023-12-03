package 백준.브론즈;

import java.io.*;
import java.util.Arrays;

public class 브론즈10818 {
    public static void main(String[] args) throws IOException {

        //최대 최소

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        arr = br.readLine().split(" ");

        int[] intArr = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);


        System.out.println(intArr[0] + " " + intArr[arr.length-1]);
    }
}
