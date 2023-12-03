package 백준.실버;

import java.util.*;

public class 촌수계산2644 {

    static int[] parent;
    static List<Integer>[] list;
    static int N; // 사람 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        // 유니온파인드하자
        parent = new int[N + 1];
        for (int i = 1; i <= N; i++)
            parent[i] = i;

        // 인접리스트 만들자
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            list[i] = new ArrayList<>();


        int A = sc.nextInt(); // 찾고자하는 촌수사람
        int B = sc.nextInt(); // 찾고자하는 촌수사람

        int r = sc.nextInt(); // 촌수 입력횟수

        for (int i = 0; i < r; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (find(parent[a]) != find(parent[b]))
                union(find(parent[a]), find(parent[b]));

            list[a].add(b); // 인접리스트 만들자
            list[b].add(a); // 인접리스트 만들자
        }

        // 만약 부모가 다르다면 촌수를 판단 못하므로 바로 -1
        if (parent[A] != parent[B]) {
            System.out.println(-1);
            System.exit(0);
        }

        boolean[] visit = new boolean[N+1];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{A, 0}); // 알고싶은 촌수 중 시작하나 정하기, 촌수

        while (!q.isEmpty()) {

            int[] pick = q.poll();
            int idx = pick[0];
            int cnt = pick[1];

            visit[idx] = true;

            if (idx == B) {
                System.out.println(cnt);
//                System.exit(0);
            }

                for (int i = 0; i < list[idx].size(); i++) {
                    int num = list[idx].get(i);
                    if(!visit[num])
                        q.add(new int[]{num, cnt + 1});
            }
        }
    }

    static int find(int a) {
        if (a != parent[a])
            parent[a] = find(parent[a]);

        return parent[a];

    }

    static void union(int a, int b) {

        parent[b] = a;

    }

}
