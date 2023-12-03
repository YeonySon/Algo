package 백준.골드;

import java.lang.reflect.Array;
import java.util.*;

public class ACMCRAFT1005 {
    static int N;
    static int K;
    static int[] in; // 진입차수
    static int[] time; // 건물세우는 시간
    static List<Integer>[] list; // 인접리스트 만들자
    static List<int[]> list2;
    static StringBuilder sb;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트케이스

        sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {


            N = sc.nextInt(); // 건물의 개수
            K = sc.nextInt(); // 규칙개수

            // 건물짓는 시간
            time = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                time[i] = sc.nextInt();
            }

            //인접리스트만들자
            list = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) {
                list[i] = new ArrayList<>();
            }

            // 이제 건물짓는 순서 받자
            in = new int[N + 1];
            for (int i = 1; i <= K; i++) {

                int a = sc.nextInt(); // 사전작업
                int b = sc.nextInt(); // a를 처리해야 b가 가능

                list[a].add(b);
                in[b]++;
            } // end 건물짓는 순서

            int target = sc.nextInt(); // 목표건물번호

            // 소요시간이 많이 걸리는 놈 순으로
            Queue<Integer> q = new LinkedList<>();

            // 진입차수를 돌면서 0인 것들을 먼저 넣어주자
            int totalTime = 0;
            int[] result = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                if (in[i] == 0) {
                    q.add(i);
                    result[i] = time[i];
                }
            }

            outer:
            while (!q.isEmpty()) {

                int before = q.poll();

                // 해당 건물이면 break 하자
                if(before == target) break outer;

                for (int i = 0; i < list[before].size(); i++) {

                    int after = list[before].get(i);
                    --in[after]; // 진입차수 줄이기
                    // result[number] = Math.max(result[number],result[num])+time[number];

                    // 사전작업 중에 큰 값을 갱신해주고 나서 그 값을 찾으면 본인 건물 시간 더해주자
                    if (result[before] + time[after] >= result[after]) {
                        result[after] = result[before] + time[after];
                    }

                    if (in[after] == 0) {
                        q.add(after);
                    }
                } // end 사전작업 찾는 for문

            }

            sb.append(result[target]).append("\n");
            //System.out.println(tc + " " + result[target]);
            //System.out.println(Arrays.toString(result));


        } // end 테스트케이스
        System.out.println(sb);

    }


}
