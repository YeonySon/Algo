package 알고리즘정리;

import java.util.*;

public class 프림 {
    static List<int[]>[] list;
    static boolean[] visit;
    static int N;
    static int M;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점개수
        M = sc.nextInt(); // 노선개수

        list = new ArrayList[N + 1];
        for (int i = 1; i <=N; i++)
            list[i] = new ArrayList<>();


        for (int i = 0; i < M; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();

            list[a].add(new int[]{b, v});
            list[b].add(new int[]{a, v});

        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        visit = new boolean[N + 1];
        // 프림은 한 정점에서 시작해서
        // 그 정점에 연결된 간선 중에서 가장 작은 가중치를 큐에 넣고
        // 넣은 정점에서 또 연결되어있는 가중치들 중 작은 것을 계속 연결하면서
        // 정점개수가 되어을 때 그 때 다 연결되어있으므로 그 연결되어있는 것들이 최소값들이다

        pq.addAll(list[1]);
        visit[1] = true;

        int sum = 0;
        while (!pq.isEmpty()) {

            int[] pick = pq.poll();

            int end = pick[0];
            int v = pick[1];

            if (visit[end]) continue;

            visit[end] = true;
//            System.out.println(end + " " + v);
            sum += v;

            // 끝점이 이제는 시작점이 되어 그것과 연결되어있는 것들 큐에 넣어주자, 이미 큐에는 첫번째 넣어준것들 있다는거 잊지말기
            for (int i = 0; i < list[end].size(); i++) {
                if (!visit[list[end].get(i)[0]]) {
                    pq.add(list[end].get(i));
//                    if(end == 4) {
//                        System.out.println(list[end].get(i)[0]);
//                        int t = list[end].get(i)[0];
//                        for(int[] a : list[t]){
//                            System.out.println(a[0] + " "+ a[1]);
//                        }
//                        System.out.println();
//                    }
//                    pq.addAll(list[list[end].get(i)[0]]);


                }


            }
        }
        System.out.println(sum);
    }

}
