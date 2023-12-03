package 백준.실버;

import java.util.*;

public class DFS와BFS1260 {
    //인접리스트로 활용
    static Scanner sc;
    static List<Integer>[] list;
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visit;
    static int N;
    static int M;
    static int num;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점개수
        M = sc.nextInt(); // 간선개수
        num = sc.nextInt(); // 시작

        list = new List[N];
        // 정점개수만큼
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        // 간선개수만큼
        for (int i = 0; i < M; i++) {

            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            list[a].add(b);
            list[b].add(a);
        }

        // 오름차순으로  정점 정렬
        for (int i = 0; i < N; i++)
            Collections.sort(list[i]);


        visit = new boolean[N];

        dfs(num - 1);
        visit = new boolean[N];
        System.out.println();
        bfs(num - 1);

    }

    private static void dfs(int v) {

        visit[v] = true;
        System.out.print((v + 1) + " ");

        for (int i = 0; i < list[v].size(); i++) {
            if (!visit[list[v].get(i)]) {
                dfs(list[v].get(i));
            }
        }
    }

    private static void bfs(int v) {

        q.offer(v);
        visit[v] = true;

        while (!q.isEmpty()) {

            int peek = q.poll();
            System.out.print((peek + 1) + " ");
            for (int i = 0; i < list[peek].size(); i++) {

                if (!visit[list[peek].get(i)]) {

                    q.offer(list[peek].get(i));
                    visit[list[peek].get(i)] = true;
                }

            }


        }


    }

}
