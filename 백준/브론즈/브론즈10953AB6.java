package 백준.브론즈;

import java.io.*;

public class 브론즈10953AB6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i =0; i<T; i++){
            String word = br.readLine();
            int target = word.indexOf(",");
            int result = Integer.parseInt(word.substring(0,target)) + Integer.parseInt(word.substring(target+1));
            bw.write(result + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }
}
