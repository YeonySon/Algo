package 알고리즘정리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 위상정렬 {

    static Scanner sc;
    static int T = 10;
    static int N;
    static int M;
    static int in[];
    static List<Integer>[] list;

    public static void main(String[] args) {

        sc = new Scanner(System.in);

        for (int tc = 1; tc <= T; tc++) {

            N = sc.nextInt();
            M = sc.nextInt();

            list = new ArrayList[N];
            // 리스트 방 만들어주자
            for (int i = 0; i < N; i++)
                list[i] = new ArrayList<>();

            in = new int[N]; // 진입배열

            // 인접리스트 만들자
            for (int i = 0; i < M; i++) {

                int a = sc.nextInt() - 1; // 0부터 시작임
                int b = sc.nextInt() - 1;

                // a를 끝내면 b를 작업할 수 있다
                list[a].add(b);
                in[b]++; // 진입차수 증가

            }

            Queue<Integer> q = new LinkedList<>();

            // in 배열에서 진입차수가 0인거 집어넣기
            for (int i = 0; i < N; i++) {
                if (in[i] == 0)
                    q.add(i);
            }

            // 큐에서 진입차수가 0인 아이들 집어넣자
            List<Integer> list2 = new ArrayList<>();

            // 진입차수가 0인거 큐에서 빼주면서 연결되어있는 아이들
            // 차수하나씩 줄여주고 나서
            // 혹시 차수가 0이되면 다시 큐에 집어넣자
            while (!q.isEmpty()) {

                int idx = q.poll();
                list2.add(idx);

                for (int i = 0; i < list[idx].size(); i++) {

                    in[list[idx].get(i)]--;

                    if (in[list[idx].get(i)] == 0) {
                        q.add(list[idx].get(i));
                    }
                }
            }

            System.out.print("#" + tc);
            for (int num : list2) {
                System.out.print(" " + (num + 1));
            }
            System.out.println();

        }

    }

}