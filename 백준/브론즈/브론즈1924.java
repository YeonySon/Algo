package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브론즈1924 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        int target = result.indexOf(" ");
        int m = Integer.parseInt(result.substring(0,target));
        int d = Integer.parseInt(result.substring(target+1));

        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        int a = 0;
        for (int i =0; i<m; i++){
            a+=month[i];
        }
        a+=d-1;
        System.out.println(day[a%7]);

    }
}
