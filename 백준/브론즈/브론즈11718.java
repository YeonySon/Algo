package 백준.브론즈;

import java.io.*;

public class 브론즈11718 {
    public static void main(String[] args) throws IOException {
        //입력받은 그대로 출력하기
        //Hello
        //Baekjoon
        //Online Judge

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while ((str=br.readLine())!=null){
            bw.write(str + "\n");
        }

        br.close();
        bw.flush();
        bw.close();


    }
}
