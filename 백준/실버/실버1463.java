package 백준.실버;

import java.io.*;

public class 실버1463 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int count = 0;
        do {
           if (a%3==0 && a%6==0){
               a=a/3;
               count++;
           } else if (a%2==0){
               a=a/2;
               count++;
           } else if(a%3!=0 && a%2!=0) {
               a-=1;
               count++;
           }

        }while (a!=1);

        bw.write(count+"");

        br.close();
        bw.flush();
        bw.close();

    }
}
