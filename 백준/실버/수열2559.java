package 백준.실버;

import java.util.Scanner;

public class 수열2559 {
    static Scanner sc;
    static int[] arr;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int D = sc.nextInt(); // 배열 크기, 전체날짜수
        int N = sc.nextInt(); // 연속적인 날수

        arr = new int[D];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        //범위안에서 값을 더한것을 매번 최대값이랑비교
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < D-N+1; i++) { // key포인트 -> 범위안에서 비교해야하므로 10일때 5개씩범위로 작으면 총 6번 실행해야한다
            int count = 0;
            for (int j = i; j < i+N; j++) {
                count += arr[j];
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }
}
