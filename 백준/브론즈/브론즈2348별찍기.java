package 백준.브론즈;

import java.io.*;

public class 브론즈2348별찍기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i =0; i<t; i++){

            for (int j=0; j<t-i-1; j++){
                bw.write(" ");
            }

            for (int j =0; j<i+1; j++){
                bw.write("*");
            }
                bw.write("\n");

        }
        br.close();
        bw.flush();
        bw.close();

    }
}
