package 백준.실버;

import java.util.*;

public class 덩치 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 문제 조건이 몸무게랑 키가 둘다 클때만 성립
        // 완탐으로 하나씩 돌자

        int N = sc.nextInt(); // 학생 수

        if (N == 1) {
            System.out.println(1);
            System.exit(0);
        }

        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();

            arr[i][0] = weight;
            arr[i][1] = height;
        }


        // 이제 부터 자기 자신 제외한 나머지 돌면서 자기가 몇등인지 체크하자
        for (int i = 0; i < N; i++) {
            int rank = 1;

            for (int j = 0; j < N; j++) {
                // 자기 자신은 비료할 필요x
                if (i == j) continue;

                // 조건에 맞는 덩치가 작을경우
                if ((arr[i][0] < arr[j][0]) && (arr[i][1] < arr[j][1])) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}
