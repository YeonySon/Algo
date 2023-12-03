package 백준.브론즈;

import java.io.*;

public class 브론즈11721 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        for (int i = 0; i <word.length()/10+1; i++) {


            if ((i+1)*10<word.length()){
                System.out.println(word.substring(i*10,i*10+10));
            } else{
                System.out.println(word.substring((i)*10));
            }

        }
    }
}