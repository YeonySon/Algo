package 백준.실버;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 프린터큐1966 {
    static Scanner sc;
    static Queue<Priority> q;

    static class Priority{
        int idx;
        int value;

        Priority(int idx, int value){
            this.idx = idx;
            this.value = value;
        }

    }


    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 개수

        for(int tc=1; tc<=T; tc++){

            int N = sc.nextInt(); // 개수
            int num = sc.nextInt(); // 인덱스
            q=new LinkedList<>();

            for(int i=0; i<N; i++){
                q.offer(new Priority(i,sc.nextInt()));
            }

            while(true){

                // 우선순위 높은게 있으면
                Priority temp = q.poll();




            }







        }


    }
}
