package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브론즈2869달팽이 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers," ");

        int a = Integer.parseInt(st.nextToken()); // up
        int b = Integer.parseInt(st.nextToken()); // down
        int target = Integer.parseInt(st.nextToken()); // 최종 목표
        //1일차 : a
        //2일차 : a-b+a
        //3일차 : a-b+a-b+a
        //x일차 : (a-b)*(x-1)+a
        //target=ax-bx-a+b+a
        //target-b = (a-b)x
        //x = (target-b)/(a-b)
        int day = (target-b) / (a-b);

        if(((target-b) % (a-b) != 0))
            day++;

        System.out.println(day);

        
    }
}
