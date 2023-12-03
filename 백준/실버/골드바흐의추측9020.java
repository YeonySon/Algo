package 백준.실버;

import java.util.Scanner;

public class 골드바흐의추측9020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int tc = 1; tc <= n; tc++) {
            int num = sc.nextInt();

            int[] arr = new int[10001];

            for (int i = 2; i <= 10000; i++) {
                arr[i] = i;
            }
            arr[1] = 0;// 1은 소수가 아니므로

            for (int i = 2; i <= 10000; i++) {
                if (arr[i] == 0)
                    continue; // 스킵
                // 자기 자신 빼고 배수들 0으로 초기화
                for (int j = 2 * i; j <= 10000; j += i) {
                    arr[j] = 0;
                }
            }

            // 받은 수 반나눠서 생각

            int high = 0;
            int low = 0;

            high = num / 2;
            low = num / 2;
            //소수가 될때까지
            while (arr[high] == 0 || arr[low] == 0) {
                high++;
                low--;
            }
            System.out.println(low + " " + high);
        }
    }

}
