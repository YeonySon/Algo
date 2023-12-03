package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 컵홀더 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        char[] arr = line.toCharArray();
        int countS = 0;
        int countL = 0;
        for(int i=0; i<n; i++){
            if (arr[i]=='S')
                countS++;

            if (arr[i]=='L')
                countL++;

        }
        int realCount = countS+(countL/2);
        if (countL>1){
            System.out.println(2+realCount-1);
        } else
            System.out.println(2+realCount-1-1);


    }
}
