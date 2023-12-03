package 백준.골드;

import java.util.*;

public class 게임개발1516 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] time = new int[N + 1]; // 각 건물 건설하는데 걸리느 시간
        int[] result = new int[N + 1]; // 최종 사전 작업 후 걸리는 시간
        int[] in = new int[N + 1]; // 진입차수

        // 인접리스트 만들기
        List<Integer>[] list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= N; i++) {

            time[i] = sc.nextInt(); // 해당번호 건물 건설하는데 걸리는 시간
            outer:
            while (true) {


                int num = sc.nextInt();

                if (num == -1) {
                    break outer;
                } else {
                    list[num].add(i); // 사전 작업
                    in[i]++; // 진입차수 증가
                }
            } // end while문
        } // end for 문


        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            if (in[i] == 0) {
                q.add(i);
                result[i] = time[i];
            }
        }


        while (!q.isEmpty()) {

            int before = q.poll();

            for (int i = 0; i < list[before].size(); i++) {

                int after = list[before].get(i); // 다음 작업
                // 진입차수 줄이기

                // 후 작업까지 걸리는 최대시간 갱신, 최대시간으로 갱신해야 사전 작업이 다 완료됨
                if (result[before] + time[after] >= result[after]) {
                    result[after] = result[before] + time[after];
                }

                --in[after];

                if (in[after] == 0) {
                    q.add(after);
                }
            } // end for
        } // end while

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);

    }
}
