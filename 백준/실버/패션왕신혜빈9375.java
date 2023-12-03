package 백준.실버;

import java.util.HashMap;
import java.util.Scanner;

public class 패션왕신혜빈9375 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt();
            HashMap<String, Integer> hashMap = new HashMap<>();

            int result = 1;
            for (int i = 0; i < N; i++) {
                String s = sc.next();

                String str = sc.next();

                if (hashMap.containsKey(str)) {
                    hashMap.put(str, hashMap.get(str) + 1);
                } else {
                    hashMap.put(str, 1);
                }
            }

            for (int a : hashMap.values()) {
                result *= (a + 1);
            }

            System.out.println(result - 1);
        }
    }
}
