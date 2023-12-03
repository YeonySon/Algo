package 백준.브론즈;

import java.io.*;

public class 브론즈1110숫자더하기 {
    public static void main(String[] args) throws IOException {

        //26 을 더하면 8 그 다음 68 더하면14 그 다음 84 더하면 12 그 다음 42 더하면 6 그 다음 26 이렇게 몇번만에
        //만약 0보다 작으면 십의자리에 0을 붙여서 2자리로 만든다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        if (num.length()==1){
            num=0+""+num;
        }
        String lastNum = "";
        int count = 0;
        int num1 = Integer.parseInt(num.substring(0,1));
        int num2 = Integer.parseInt(num.substring(1));

        String num3 = num1 + "" + num2;
        while (!num.equals(lastNum)) {
            int numFist1 = Integer.parseInt(num3.substring(0, 1));
            int numLast1 = Integer.parseInt(num3.substring(1));

            int num4 = numFist1 + numLast1;
            String num5 = Integer.toString(num4);
            if (num5.length()==1){
                num5=0+""+num5;
            }
            int numFist2 = Integer.parseInt(num5.substring(0, 1));
            int numLast2 = Integer.parseInt(num5.substring(1));

            lastNum = numLast1 + "" + numLast2;
            num3 = lastNum;
            count++;
        }
        // .write() 는 string 타입만 나오므로 int형은 변환해줘야함
        bw.write(String.valueOf(count));

        br.close();
        bw.flush();
        bw.close();



    }
}
