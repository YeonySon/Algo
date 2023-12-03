package 백준.실버;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 숨박꼭질1697 {

    static int[] dist = new int[100001];
    static int start;
    static int end;
    static PriorityQueue<Edge> pq;


    static class Edge implements Comparable<Edge> {

        int e, v;

        public Edge(int e, int v) {
            this.e = e;
            this.v = v;
        }

        @Override
        public int compareTo(Edge o) {
            return this.v - o.v;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        start = sc.nextInt();
        end = sc.nextInt();

        if(start == end){
            System.out.println(0);
            System.exit(0);
        }


        for (int i = 0; i < 100001; i++)
            dist[i] = Integer.MAX_VALUE;


        pq = new PriorityQueue<>();

        // 시작점을 정점 start로 두자
        dist[start] = 0;
        pq.add(new Edge(start, dist[start]));

        boolean[] visit = new boolean[100001];

        while (!pq.isEmpty()) {

            Edge pick = pq.poll();

            int now = pick.e;
            int second = pick.v;

            if (visit[now]) continue;

            visit[now] = true;

            // -1 만큼 이동
            int p1 = now - 1;
            if (p1 >= 0 && dist[p1] > second + 1) {
                dist[p1] = second + 1;
                pq.add(new Edge(p1, dist[p1]));
            }

            // +1 이동
            int p2 = now + 1;
            if (p2 < 100001 && dist[p2] > second + 1) {
                dist[p2] = second + 1;
                pq.add(new Edge(p2, dist[p2]));
            }

            int p3 = now * 2;
            if (p3 < 100001 && dist[p3] > second + 1) {
                dist[p3] = second + 1;
                pq.add(new Edge(p3, dist[p3]));
            }
        }

        System.out.println(dist[end]);


    }


}
