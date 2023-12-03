package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 실버1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sequence(Integer.parseInt(br.readLine())));

        br.close();
    }

    public static int sequence(int num){

        int total = num;

        if (num<100){
            return num;
        } else {
            total =99;

            for (int i =100; i<=num; i++){
                //세자리 수 중 백의자리
                int a = i / 100;
                //십의 자리
                int b = (i/10) % 10;
                //일의 자리
                int c = i%10;

                if ((a-b) == (b-c)){
                    total++;
                }
            }
        }
        return total;
    }

}
