package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 가운데를말해요1655 {
    public static void main(String[] args) throws IOException {

        // 큐를 두개 준비하자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();


        for (int i = 0; i < N; i++) {

            int num = Integer.parseInt(br.readLine());

            // 혹시 pq1의 peek이 pq2 의 peek이랑 비교해서 크면 서로 자리 바꿔주자

            // 둘의 사이즈가 같다면 무조건 pq1에 집어넣기
            if (pq1.size() == pq2.size()) {
                pq1.add(num);

                if (!pq2.isEmpty() && pq1.peek() > pq2.peek()) {

                    int tmp1 = pq1.poll();
                    int tmp2 = pq2.poll();

                    pq1.add(tmp2);
                    pq2.add(tmp1);

                }


                sb.append(pq1.peek()).append("\n");
            } else {
                // 사이즈가 차이나면 그 때 맞춰주기
                pq2.add(num);

                if (pq1.peek() > pq2.peek()) {

                    int tmp1 = pq1.poll();
                    int tmp2 = pq2.poll();

                    pq1.add(tmp2);
                    pq2.add(tmp1);

                }

                sb.append(pq1.peek()).append("\n");
            }


        }
        System.out.println(sb);


    }
}
