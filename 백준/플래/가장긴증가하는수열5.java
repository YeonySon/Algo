package 백준.플래;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가장긴증가하는수열5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열크기


        // 배열받기, 10억까지라 int
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        if (N == 1) {
            sb.append(1).append("\n");
            sb.append(arr[1]);
            System.out.println(sb);
            System.exit(0);
        }


        List<Integer> longList = new ArrayList<>(); // 증가하는 수열 길이
        int[] idx = new int[N + 1]; // longList에서 몇번째에 해당하는지 체크하는 배열

        // 맨 처음은 필요없으므로, 1번부터 시작할거라
        // 첨에 -1로 했다가 수열의 범위가 -10억부터여서 틀렸다.. 범위 보자
        longList.add(Integer.MIN_VALUE);

        // nlogn 이분탐색으로 진행
        // 만약에 리스트에 있는 마지막 숫자보다 크면 그냥 add
        // 작다면 그 안에서 이분탐색으로 적당한 위치 찾아주고 그 위치의 값이랑 교환해준다

        for (int i = 1; i <= N; i++) {

            int number = arr[i];
            int left = 1;
            int right = longList.size() - 1;

            // 리스트에 마지막에 있는 숫자랑 비교해서 크면 그냥 추가해주면 그게 증가하는 수열부분
            if (number > longList.get(longList.size() - 1)) {
                longList.add(number);
                idx[i] = longList.size() - 1; // 어느번째 길이였다
            } else {
                // 리스트의 마지막 숫자보다 작을 때 이분탐색 활용해서 적절한 위치 적용해주자
                while (left < right) {

                    int mid = (left + right) / 2;

                    if (longList.get(mid) >= number) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                } // end while
                // 이제 위치가 정해진거이므로
                longList.set(right, number);
                idx[i] = right;
            } // end else
        } // end for문


        //최장길이
        int maxSize = longList.size() - 1;
        sb.append(maxSize).append("\n");

        // 수열출력해주기
        // 역순으로 가면서 그 최장길이랑 같을 때 그 숫자를 넣어준다
        Stack<Integer> stack = new Stack<>();


        for (int i = N; i >= 1; i--) {

            if (maxSize == idx[i]) {
                stack.push(arr[i]);
                maxSize--;
            }
        }

        while (!stack.isEmpty()) {
            int num = stack.pop();
            sb.append(num + " ");
        }

        System.out.println(sb);

    }
}
