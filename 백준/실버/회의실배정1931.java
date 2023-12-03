package 백준.실버;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 회의실배정1931 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt(); // 개수

        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt(); // 시작
            arr[i][1] = sc.nextInt(); // 끝
        }

//        System.out.println(arr[0][0] + " " + arr[0][1]);

       // 회의종료시간을 기준으로 먼저 끝나느 시간 순으로 정렬을하고 그 종료시점보다 같거나 뒤에있는 시작 시간을 찾는다.
        // 혹 시작하는 시간이 같은 경우 종료시간이 빠른 순으로 찾아야 더 많이 회의를 할 수 있다고 생각했습니다.

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                // 만약 종료시간 같으면 시작시간이 빠른 순으로
                // 그래야만 7 7 과 7 8 이 있을 때 77을 얼른 끝내고 7 8 을 할 수 있으므로 이걸 생가하는걸 빠드려서
                // 85퍼에서 계속 틀림....
                if (o1[1]==o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1]-o2[1];
            }
        });



        // 정렬을 했기 때문에 가장 종료시간이 빠른 놈이 첫번째로 올거니깐 첫번째부터 시작하자
        int end = arr[0][1];
        int count = 1;

        // 이미 첫 회의는 결정되었기에 그 다음부터 확인해보자
        for(int i=1; i<N; i++){
            // 시작하는 시간이 end 즉 종료시간 보다 같거나 큰거 찾기
            if(arr[i][0]>=end){
                count++; // 그때 회의가 가능하기에 카운트 올려주자!
                end = arr[i][1]; // 종료시간을 그 때의 종료시간으로 초기화 해주자
            }


        }
        System.out.println(count);
    }
}
