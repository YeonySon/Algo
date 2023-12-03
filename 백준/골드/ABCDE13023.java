package 백준.골드;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABCDE13023 {
    /*5 4
            0 1
            1 2
            2 3
            3 4*/

    static int N;
    static int M;
    static int[] visit;
    static List<Integer>[] list;
    static int judge;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 정점개수
        M = sc.nextInt(); // 간선

        list = new ArrayList[N];
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        // 인접리스트 만들기
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);

        }

        visit = new int[N];

        // dfs로 한점씩 시작해서 dfs의 뎁스가 N이 되면 정점이 다 연결되도록 돈거임

        judge = 0;
        for (int i = 0; i < N; i++) {
            visit[i] = 1;
            dfs(i, 1); // 다 깊이 탐색했는데 연결이 다 안되는 경우는 다시 돌려 놓아야함
            visit[i] = 0;

            if (judge == 1) {
                System.out.println(1);
                System.exit(0);
            }
        }
        System.out.println(judge);
    }

    private static void dfs(int idx, int cnt) {


        if (cnt == 5) {
            judge = 1;
            return;
        }


        for (int num : list[idx]) {

            if (visit[num] == 1) continue;

            visit[num] = 1;
            dfs(num, cnt + 1);
            visit[num] = 0;

        }
    }

}
