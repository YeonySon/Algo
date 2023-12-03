package 백준.골드;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 트리의지름1167 {

    static int N;
    static boolean[] visit;
    static List<int[]>[] list;
    static int max;
    static int farNode;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //인접리스트만들기
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++)
            list[i] = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            int idx = sc.nextInt();

            int cnt = 1;
            int next = 0;

            while (true) {

                int a = sc.nextInt();

                if (a == -1) {
                    break;
                } else {
                    if (cnt % 2 != 0) {
                        next = a;
                    } else {
                        list[idx].add(new int[]{next, a});
                    }
                }
                cnt++;
            }
        }// end for 문

//        for(int i=1; i<=N; i++){
//            System.out.print(i+"번째 정점-> ");
//            for(int j=0; j<list[i].size(); j++){
//                System.out.print(list[i].get(j)[0]+ " ");
//            }
//            System.out.println();
//        }

        // 정점 1부터 N까지 각자 시작점으로 출발해서 최대지름 찾자
        // 이렇게 되면 n제곱 걸린다
        // 가장 먼 점이 곧 가장 긴 거리가 된다
        max = Integer.MIN_VALUE;

        // 가장 먼 거리 정점 찾자
        visit = new boolean[N + 1];
        dfs(1, 0);

        // 가장 먼 정점 찾았으니 이제 거리 구하자
        visit = new boolean[N + 1];
        dfs(farNode, 0);


        System.out.println(max);


    }

    private static void dfs(int idx, int sum) {

        if (sum > max) {
            max = sum;
            farNode = idx;
        }


        visit[idx] = true;

        for (int i = 0; i < list[idx].size(); i++) {

            int num = list[idx].get(i)[0];
            int len = list[idx].get(i)[1];

            // 방문한 곳은 가지 않기위해
            if (!visit[num]) {
                dfs(num, sum + len);
            }
        }
    }
}
