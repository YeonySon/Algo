package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 최단경로1753 {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static int M;
    static int[] dist;
    static List<int[]>[] list;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N];

        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()) - 1;

        // 인접리스트 만들기

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken());

            list[a].add(new int[]{b, v});

        }

        dist = new int[N];
        for (int i = 0; i < N; i++)
            dist[i] = Integer.MAX_VALUE;

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                // TODO Auto-generated method stub
                return o1[1] - o2[1];
            }
        });

        dist[start] = 0; // 첫 시작은 난 0부터 시작
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {

            int[] peek = pq.poll();

            if(dist[peek[0]] < peek[1]) continue;

            for (int i = 0; i < list[peek[0]].size(); i++) {

                if (dist[list[peek[0]].get(i)[0]] > dist[peek[0]] + list[peek[0]].get(i)[1]) {
                    dist[list[peek[0]].get(i)[0]] = dist[peek[0]] + list[peek[0]].get(i)[1];
                    pq.add(new int[]{list[peek[0]].get(i)[0], dist[list[peek[0]].get(i)[0]]});
                }

            }

        }

//		System.out.println(Arrays.toString(dist));

        sb = new StringBuilder();

        for (int num : dist) {
            if (num == Integer.MAX_VALUE)
                sb.append("INF\n");
            else
                sb.append(num).append("\n");
        }
        System.out.println(sb);

    }

}

