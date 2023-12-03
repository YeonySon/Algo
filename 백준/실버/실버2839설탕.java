package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 실버2839설탕 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sugar = Integer.parseInt(br.readLine());
        
        //4와 7은 3과 5로 채울수 없다

        if (sugar==4 || sugar==7){
            System.out.println(-1);
            //나머지가 1과 3은 계속 1씩 늘어난다
        } else if ((sugar%5==1) || (sugar%5==3)) {
            System.out.println((sugar/5) + 1);
            //나머지가 2와 4는 다음 패턴에서 2씩 늘어난다
        } else if ((sugar%5==2) || (sugar%5==4)){
            System.out.println((sugar/5) + 2);
            //본래 몫대로
        } else if(sugar%5==0){
            System.out.println(sugar/5);
        }
    }
}
