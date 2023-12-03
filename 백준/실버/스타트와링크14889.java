package 백준.실버;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 스타트와링크14889 {

    static Scanner sc;
    static int[][] arr;
    static int[] combiArr;
    static int[] result;
    static boolean[] visit;
    static int N;
    static int min;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N][N];


        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        // 조합순서 뽑을 배열
        combiArr = new int[N];
        for (int i = 0; i < N; i++) {
            combiArr[i] = i;
        }


        // 그 순열 결과를 담을 배열
        result = new int[N/2];

        min = Integer.MAX_VALUE;
        team(0,0);

        System.out.println(min);


    }

    private static void team(int idx, int cnt) {

        if (idx == N/2) {

            // 팀을 나누었으니 그 팀이 받을 수 있는 점수를 계산
            // 그리고 나서 최솟값을 계속 비교하자

            visit = new boolean[N];

            // 팀이 어떻게 묶여있나 확인할거
            for(int i=0; i<N; i++){
                for(int j=0; j<N/2; j++){
                    if(combiArr[i] == result[j]){
                        visit[i] = true;
                    }
                }
            }


            //team1
            int team1 = 0;
            for (int i = 0; i < N / 2; i++) {
                for (int j = 0; j < N / 2; j++) {
                    if(i==j) continue;
                    team1 += arr[result[i]][result[j]];
                }
            }
//            for(int num : list){
//                System.out.println(num);
//            }
//
//            System.out.println(Arrays.toString(result));


            //team2
            List<Integer> list = new ArrayList<>();
            int team2 = 0;
            for(int i=0; i<N; i++){
                if(!visit[i]){
                    list.add(combiArr[i]);
                }
            }

            for(int i=0; i<list.size(); i++){
                for(int j=0; j<list.size(); j++){
                    if(i==j) continue;

                    team2 += arr[list.get(i)][list.get(j)];
                }
            }



            // team2 멤버 형성 했으니 시작


           

//            System.out.println(team1 + " " + team2);

            // 두 팀의 차 구하기
            int sum = Math.abs(team1 - team2);

            if(sum >= min) return;

            if (min > sum) {
                min = sum;
            }
//            System.out.println(sum);
            return;
        }

        for (int i = cnt; i < N; i++) {
            result[idx] = combiArr[i];
            team(idx + 1, i+1);
        }


    }


}
