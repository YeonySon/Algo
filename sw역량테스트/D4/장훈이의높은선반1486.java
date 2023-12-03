package sw역량테스트.D4;

import java.util.Scanner;

public class 장훈이의높은선반1486 {
    static Scanner sc;
    static int[] arr;
    static boolean[] boo;
    static int N;
    static int target;

    static int min;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            N = sc.nextInt();
            target = sc.nextInt();
            arr = new int[N];
            boo = new boolean[N];


            // 키를 배열에 넣어주자
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            min = Integer.MAX_VALUE; // 직원들의 키 합과 선반의 높이의 차
            height(0);
            System.out.println("#" + tc + " " + min);


        }
    }

    private static void height(int idx) {

        if (idx == N) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (boo[i])
                    sum += arr[i];
            }

            //직원들의 키합이 선반높이 이상이라면
            //선반높이와 빼주고 min와 계속 비교해주면서 초기화한다

            if (sum >= target) {
                min = Math.min(min, (sum - target));
            }
            return;
        }

        boo[idx] = true;
        height(idx + 1);

        boo[idx] = false;
        height(idx + 1);


    }

}
