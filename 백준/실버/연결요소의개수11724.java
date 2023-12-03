package 백준.실버;

import java.util.*;

public class 연결요소의개수11724 {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[] visit;
    static List<Integer>[] list;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점개수
        M = sc.nextInt(); // 간선개수

        list = new ArrayList[N];
        //리스트 방 만들기
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        //인접리스트 만들기
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt() - 1; // 0부터 시작하는거로 설정해서
            int e = sc.nextInt() - 1;

            list[s].add(e);
            list[e].add(s);
        }

        visit = new boolean[N];

        int result = 0;
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                connect(i);
                result++;
            }
        }
        System.out.println(result);
    }

    private static void connect(int idx) {

        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visit[idx] = true;

        while (!q.isEmpty()) {

            int peek = q.poll();

            for (int i = 0; i < list[peek].size(); i++) {
                if (!visit[list[peek].get(i)]) {
                    q.add(list[peek].get(i));
                    visit[list[peek].get(i)] = true;
                }
            }

        }


    }


}
