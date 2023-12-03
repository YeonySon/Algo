package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 숨박꼭질3의13549 {
    static BufferedReader br;
    static int start;
    static int end;
    static int[] dist = new int[100001];

    static class Edge implements Comparable<Edge> {

        int e;
        int value;

        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }

        @Override
        public int compareTo(Edge o) {
            return this.value - o.value; // 가중치 오름차순
        }
    }

    static PriorityQueue<Edge> pq;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);


        start = Integer.parseInt(st.nextToken()); // 출발위치
        end = Integer.parseInt(st.nextToken()); // 종료위치

        // 거리 처음에 최대치로 초기화
        for (int i = 0; i < 100001; i++)
            dist[i] = Integer.MAX_VALUE;


        // 처음 출발을 start로 시작해준다.
        // 정점거리 0 으로 시작

        pq = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.value - o2.value;
            }
        });
        pq.add(new Edge(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {

            Edge edge = pq.poll();



            //바로 다이렉트로 가는게 비용이 적게 드는지?
            //아니면 어디 거쳐서 가는게 적게 드는지?
            //다익스타로 풀자


            // x-1 이동
            int p = edge.e - 1;
            // 범위를 벗어나지 않고 방문한 적도 없고
            // 가중치가 1초 더해졌을 때 보다 크다면 최소거리가 아니므로 경유해서 가는게 최소거리이다
            if (p >= 0 && p < 100001 && dist[p] > edge.value + 1) {
                dist[p] = edge.value + 1;
                pq.add(new Edge(p, dist[p])); // 다시 큐에 집어넣어준다

            }

            // x+1 이동
            int p2 = edge.e + 1;
            // 범위를 벗어나지 않고 방문한 적도 없고
            if (p2 >= 0 && p2 < 100001 && dist[p2] > edge.value + 1) {
                dist[p2] = edge.value + 1;
                pq.add(new Edge(p2, dist[p2]));

            }

            // 순간이동 *2
            int p3 = edge.e * 2;
            if (p3 >= 0 && p3 < 100001 && dist[p3] > edge.value) {
                dist[p3] = edge.value;
                pq.add(new Edge(p3, dist[p3]));
            }
        }

        System.out.println(dist[end]);

    }


}
