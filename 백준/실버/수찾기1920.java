package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 수찾기1920 {

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }


        Collections.sort(list);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
       outer :  for (int i = 0; i < M; i++) {

            int left = 0;
            int right = list.size() - 1;
            int mid = 0;

            int num = Integer.parseInt(st.nextToken());

            while (left <= right) {

                mid = (left + right) / 2;
                if (list.get(mid) > num) {
                    right = mid-1;
                } else if (list.get(mid) < num) {
                    left = mid + 1;
                } else {
                    sb.append(1).append("\n");
                    continue outer;
                }

            }
           sb.append(0).append("\n");
        }
        System.out.println(sb);

    }
}
