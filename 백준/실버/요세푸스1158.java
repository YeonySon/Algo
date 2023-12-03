package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스1158 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        //3번째일때는 아예pop
        //아닐때는 그냥 pop push

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        System.out.print("<");
        while (q.size() > 1) {
            for (int i = 1; i <= num; i++) {
                if (i == num) {
                    System.out.print(q.poll() + ", ");
                } else {
                    q.offer(q.poll());
                }
            }
        }
        System.out.print(q.poll() + ">");
    }
}
