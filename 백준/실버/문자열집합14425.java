package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 문자열집합14425 {
    static BufferedReader br;
    static StringTokenizer st;
    static Map<Integer, String> map;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 맵에 저장할개수
        int M = Integer.parseInt(st.nextToken()); // 비교할 단어개수

        for (int i = 0; i < N; i++) {
            map.put(i, br.readLine());
        }

//        System.out.println(map);

        int count = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (map.get(j).equals(str))
                    count++;
            }
        }
        System.out.println(count);
    }
}
