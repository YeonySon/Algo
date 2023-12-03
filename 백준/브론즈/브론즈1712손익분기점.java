package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브론즈1712손익분기점 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringTokenizer st = new StringTokenizer(word," ");

        int fixMoney = Integer.parseInt(st.nextToken());
        int chMoney = Integer.parseInt(st.nextToken());
        int perMoney = Integer.parseInt(st.nextToken());
        if ((perMoney-chMoney) !=0 ){
            int day = fixMoney / (perMoney-chMoney);

            if (day<0){
                System.out.println(-1);
            }else {
                System.out.println(day+1);
            }
        } else{
            System.out.println(-1);
        }
    }
}
