package sw역량테스트.모의;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 설탕배달bfs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] visit = new int[N+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // 주머니kg, 최소개수

        while (!q.isEmpty()) {

            int sugar = q.poll();

            // 너비탐색
            if (sugar +3 <=N && visit[sugar+3]==0) {
                q.add(sugar + 3); // 3kg 주머니
                visit[sugar + 3] = visit[sugar] + 1;
            }

            if(sugar+5<=N && visit[sugar+5]==0){
                q.add(sugar+5); // 5kg 주머니
                visit[sugar+5] = visit[sugar]+1;
            }

        }

        if(visit[N]==0)
            System.out.println(-1);
        else
            System.out.println(visit[N]);

    }
}
