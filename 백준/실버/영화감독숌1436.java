package 백준.실버;

import java.util.Scanner;

public class 영화감독숌1436 {
    public static void main(String[] args) {

        //숫자가 올라가면서 666 포함하면 그 때 카운트 해주자

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // n번째

        int cnt = 0; // 666 찾기

        int num = 1;
        while(cnt!=N){
            String str = String.valueOf(num);
            if (str.contains("666")){
                cnt++;
            }

            num++;
        }
        //마지막에 while문 나올 때 1이 증가한 상태로 나오므로 마지막에 1 빼주자
        System.out.println(num-1);

    }
}
