package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ox퀴즈 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            String line = br.readLine();

            int total = 0;
            int cnt = 0;
            for(int i=0; i<line.length(); i++){
                if (line.charAt(i)=='O'){
                    cnt++;
                } else{
                    cnt=0;
                }

                total += cnt;

            }
            System.out.println(total);


        }


    }
}
