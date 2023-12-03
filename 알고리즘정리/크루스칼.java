package 알고리즘정리;

import java.util.*;

public class 크루스칼 {

    static List<int[]>[] list;
    static int N;
    static int M;
    static int[] parent;
    static PriorityQueue<int[]> pq;

    public static void main(String[] args) {

        // 가중치를 오름차순으로 정렬
        // 정점을 간선으로 연결할 때 마다 둘의 집합이 같은지 안 같은지 판단
        // 같다면 연결안해주고 다르다면 연결해준다
        // priorityqueue를 활용
        // parent배열, find, union활용

        /*
sample input(첫 줄의 첫 숫자는 정점의 개수, 두 번째 숫자는 간선의 개수).
6 9
1 6 5
2 4 6
1 2 7
3 5 15
5 6 9
3 4 10
1 3 11
2 3 3
4 5 7
 */
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        // 자기 자신을 대표로 만들기
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++)
            parent[i] = i;

//        list = new ArrayList[N+1];
//        for(int i=1; i<=N; i++)
//            list[i] = new ArrayList<>();
//
//
//        // 정점이랑 간선정보 받아오기
//        // 굳이 인접리스트 안 만들고 그냥 pq에 넣어줘도 된다
//        for(int i=0; i<M; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int v = sc.nextInt();
//
//            list[a].add(new int[] {a,b,v}); // 두 정점이 같은 집합인지 아닌지 판단하려고 정보 다 넣어줘야한다
//            list[b].add(new int[]{b,a,v});
//
//        }

        // 가중치를 오름차순으로 정렬
        pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });


        // 정보 집어넣어주기
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int v = sc.nextInt();

            pq.add(new int[]{a, b, v});
        }

        // 가장 가중치가 낮은 애부터 서로 같은 집합인지 판단해서
        // 아니면 연결해주고
        // union 작은놈기준으로 해주기
        int sum = 0;
        while (!pq.isEmpty()) {

            int[] pick = pq.poll();

            // 같은 집합이 아니라면 사이클이 발생 안 하므로 연결가능
            if (find(pick[0]) != find(pick[1])) {
                sum += pick[2]; // 가중치 더해주고
                union(parent[find(pick[0])], parent[find(pick[1])]);
            } else {
                continue;
            }
        }

        System.out.println(sum);
    }

    static int find(int a) {
        // 그 자체가 집합의 대표가 아니므로 계속 집합의 대표 찾아주기
        if (parent[a] != a)
            parent[a] = find(parent[a]);

        return parent[a];
    }

    static void union(int a, int b) {
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

}
