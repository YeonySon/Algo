package 백준.브론즈;

import java.io.*;

public class 브론즈11021 {
    public static void main(String[] args) throws IOException {

        //buffer 사용해서 A+B-7 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            String word;
            while ((word=br.readLine() )!= null) {

                int target = word.indexOf(" ");
                int num1 = Integer.parseInt(word.substring(0, target));
                int num2 = Integer.parseInt(word.substring(target + 1));


                int result = num1 + num2;
                bw.write(result + "\n");

            }
        br.close();
        bw.flush();
        bw.close();

    }
}
