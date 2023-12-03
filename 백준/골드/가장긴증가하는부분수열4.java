package 백준.골드;

import java.util.Scanner;
import java.util.Stack;


public class 가장긴증가하는부분수열4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt(); // 수열 개수
        int[] arr = new int[N]; // 수열 받을 배열

        int[] dp = new int[N]; // 본인의 위치에서 최대 증가하는 부분수열 개수

        // 수열을 받자
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        // 일단 처음에는 자기자신 자체가 가장긴수열이므로 1로 초기화하자
        for (int i = 0; i < N; i++)
            dp[i] = 1;

        if(N==1){
            System.out.println(1);
            System.out.println(arr[0]);
        } else {


            // 최대증가수열길이 찾아보자
            int maxLength = 0; // 최대길이

            // 두번째 숫자부터 비교
            for (int i = 1; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j]) {
                        // 자기 앞에 있는 애들보다 자신이 클 때 증가수열이 가능하므로
                        // 그 앞까지의 최대배열에 +1 즉 자기 자신을 포함한거의 값이랑
                        // 비교하면서 최대값을 갱신하자
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                } // end inner for문

                // 주어진 수열에서의 최장길이 갱신해주자
                if (dp[i] > maxLength) {
                    maxLength = dp[i];
                }
            }// end outer for 문

            sb.append(maxLength).append("\n");

            // 수열의 뒤부터 돌면서 최장길이랑 dp값이 같으면
            // 스택에 집어넣고 길이하나줄이고
            // 그렇게 끝까지 돌고나서
            // 스택에 있는거 역순으로 출력해주면 최장부분 수열 나온다

            Stack<Integer> stack = new Stack<>();
            // 뒤에서부터 돌자
            for (int i = N - 1; i >= 0; i--) {
                if (dp[i] == maxLength) {
                    stack.push(arr[i]);
                    maxLength--;
                }
            }//end 뒤부터 for문

            // 스택에 담긴거 역순으로 뽑자
            while (!stack.isEmpty()) {
                int num = stack.pop();
                sb.append(num).append(" ");
            }

            System.out.println(sb);
        }
    }
}
