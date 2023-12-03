package 백준.실버;

import java.util.*;

public class 수열2491 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
        } else {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            //증가하는거 찾기
            List<Integer> plus = new ArrayList<>();
            int cnt = 1;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    cnt++;
                    plus.add(cnt);
                } else {
                    cnt = 1;
                }
            }

            int pulsMax = Integer.MIN_VALUE;
            for (int i = 0; i < plus.size(); i++) {
                pulsMax = Math.max(pulsMax, plus.get(i));
            }

            List<Integer> minus = new ArrayList<>();
            int cnt2 = 1;
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    cnt2++;
                    minus.add(cnt2);
                } else {
                    cnt2 = 1;
                }
            }


            int minusMax = Integer.MIN_VALUE;
            for (int i = 0; i < minus.size(); i++) {
                minusMax = Math.max(minusMax, minus.get(i));
            }

            int max = Math.max(pulsMax, minusMax);

            System.out.println(max);
        }
    }
}
