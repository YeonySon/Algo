package 알고리즘정리;

import java.util.*;

public class 다익스트라 {

    // 방향성을 가질 때
    // 거쳐서 가는게 가중치가 적은지 아니며 직접가는지가 비교
    // 첫 시작점에서 항상 출발할거임
    // 2에서 출발하는데 2->5로 가는 것 or 2->4->5로가느것 누가 더 짧은지
    // dist[5] or dist[4] + 4 에서 5로가는 길이

    static List<Edge>[] list;
    static int[] dist; // 거리
    static boolean[] visit;
    static int N;
    static int M;

/*          5 9
            1 2 10
            1 3 5
            2 3 2
            3 1 1
            3 2 13
            4 1 8
            4 5 3
            5 4 9
            5 2 31*/

    static class Edge implements Comparable<Edge>{
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
        N = sc.nextInt();
        M = sc.nextInt();

        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            list[i] = new ArrayList<>();


        dist = new int[N + 1];
        visit = new boolean[N + 1];

        //인접리스트 만들기
        for (int i = 0; i < M; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();

            list[a].add(new Edge(b, v));

        }


        // 거리 최대치로 만들고 시작
        for(int i=1; i<=N; i++)
            dist[i] = Integer.MAX_VALUE;

        // 시작점을 정해서 출발하자 4에서 출발
        
        dist[4] = 0; // 출발지점은 본인자신이므로 거리 0으로 시작
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(4,0));
        
        // 큐에서 하나씩 꺼내면서 다음 정점으로 다이렉트로가는게 빠른지 아니면 거쳐서 가는게 빠른지 비교
        while (!pq.isEmpty()){

            Edge pick = pq.poll();
            
            if (visit[pick.e]) continue; //이미 연결되어있으면 스킵

            visit[pick.e] = true;

            for(int i=0; i<list[pick.e].size(); i++){

                int nextEdge = list[pick.e].get(i).e;
                int value = list[pick.e].get(i).v;

                if(dist[nextEdge] > dist[pick.e] + value){
                    dist[nextEdge] = dist[pick.e] + value;

                    pq.add(new Edge(nextEdge, dist[nextEdge]));
                }
            }
        }

        System.out.println(Arrays.toString(dist));




    }

}
