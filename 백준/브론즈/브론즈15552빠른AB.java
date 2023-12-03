package 백준.브론즈;

import java.io.*;

public class 브론즈15552빠른AB {
    public static void main(String[] args) throws IOException {

        //스캐너를 쓰는 것보다는 buffer를 쓰는 것이 훨씬 빠르고 System.out.println(); 도 속도가 넘 느리다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String word = br.readLine();
        while (word != null) {

            int target = word.indexOf(",");
            int result = Integer.parseInt(word.substring(0, target)) + Integer.parseInt(word.substring(target + 1));
            bw.write(result + "\n");



        }

        br.close();
        bw.flush();
        bw.close();


    }
}
