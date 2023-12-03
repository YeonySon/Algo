package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제011866 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++)
            q.add(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (q.size() > 1) {

            for (int i = 1; i < target; i++) {

                q.add(q.poll());
            }

            sb.append(q.poll() + ", ");
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb);


    }
}
