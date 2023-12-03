package 백준.골드;

import java.util.*;

public class 작업2056 {

    static Scanner sc;
    static int N;
    static int[] inside;
    static List<Integer>[] list;
    static int sum = 0;
    static int[] time;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt();

        list = new ArrayList[N];
        // 리스트 방 만들자
        for (int i = 0; i < N; i++)
            list[i] = new ArrayList<>();

        inside = new int[N];
        time = new int[N];

        int[] realTime = new int[N]; // 실제 최종적으로 걸리는 시간

        // 인접리스트 만들기
        for (int i = 0; i < N; i++) {

            int value = sc.nextInt();
            time[i] = value;
            realTime[i] = value;

            int M = sc.nextInt(); // 선행관계개수

            for (int j = 0; j < M; j++) {
                int a = sc.nextInt() - 1;

                list[a].add(i);
                inside[i]++;

            }

        }

//		for (int i = 0; i < N; i++) {
//			for (int num : list[i]) {
//				System.out.print(num + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println(Arrays.toString(time));
//		System.out.println(Arrays.toString(inside));

        Queue<Integer> q = new LinkedList<>();

        // 진입차수 0 인거 큐에 넣자
        for (int i = 0; i < N; i++) {
            if (inside[i] == 0) {
                q.add(i);

            }
        }

        while (!q.isEmpty()) {

            int idx = q.poll();

            for (int i = 0; i < list[idx].size(); i++) {

                inside[list[idx].get(i)]--;
                realTime[list[idx].get(i)] = Math.max(realTime[list[idx].get(i)], realTime[idx] + time[list[idx].get(i)]);

                if (inside[list[idx].get(i)] == 0) {
                    q.add(list[idx].get(i));
                }
            }

        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
            max = Math.max(max, realTime[i]);

//        System.out.println(Arrays.toString(realTime));

        System.out.println(max);
    }

}
