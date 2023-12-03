package 백준.골드;

import java.util.Arrays;
import java.util.Scanner;

public class 색종이붙이기17136 {
    static int[][] arr;
    static int[][] tmp;
    static int[] count;
    static int min;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        arr = new int[10][10];
        tmp = new int[10][10]; // 복사할 지도
        count = new int[6]; // 색종이수 카운트

        // 지도를 받자고요
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                arr[r][c] = sc.nextInt();
                tmp[r][c] = arr[r][c];
            }
        }

        //출발을 해보자고요
        min = Integer.MAX_VALUE;
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                dfs(r, c, tmp);
            }
        }
        
        // 만약에 min이 갱신이 안 되었다면 그거는
        // 색종이로 붙일 수 없는 1이 있는거이기 때문에
        // 문제에 주어진대로 -1을 출력한다
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    } // end main

    private static void dfs(int r, int c, int[][] tmp) {
        //기저조건
        if (r == 10) {
//            System.out.println(Arrays.toString(count));

            // 다 돌았을 때  즉 1이 없이 색종이가 다 잘 붙어져있을 때
            // 색종이개수 배열의 값을 모두 더한거 최솟값이랑 비교하면서
            // 계속 갱신하자
            if (check()) {
                int sum = 0;
                for (int num : count)
                    sum += num;

                min = Math.min(min, sum);

//               for(int i=0; i<10; i++){
//                   for(int j=0; j<10; j++){
//                       System.out.print(tmp[i][j]+" ");
//                   }
//                   System.out.println();
//               }
            }
            return;
        }


        if (c == 10) {
            //열끝에 도달한거니깐 그 다음 행으로 고고씽
            dfs(r + 1, 0, tmp);
            return;
        }

        if (tmp[r][c] == 0) {
            // 다음 칸 으로 가자
            dfs(r, c + 1, tmp);
        } else {
            // 1인 칸
            // 색종이 돌자
            outer : for (int i = 1; i <= 5; i++) {

                if (count[i] == 5) continue; // 색종이5장이면 더 이상 사용 불가능

                int px = r; // 현재 x좌표
                int py = c; // 현재 y좌표

                // 요 부분에서 시간 오래걸렸네 하...
                // 첨에는 px+i>9라고만 계속 생각했는데 그게 아니라
                // 매번 nxn이 바뀔때마다 그 값도 바꿔야하므로
                // 밑에처럼 바뀌어야한다 
                if (px > 10 - i || py > 10 - i) continue; // 범위밖이면 skip

                //n*n 만큼 돌면서 확인하자 0 이 있으면 그 색종이는 못 붙여
                for (int row = px; row < px + i; row++) {
                    for (int col = py; col < py + i; col++) {
                        // 0 이 나왔다는거는 그 nxn을 만족하지 않는거이므로 다음
                        // nxn으로 달려가자
                        if (tmp[row][col] == 0)
                            continue outer;
                    }
                }

                // 여기부분으로 왔다? 그건 바로 색종이 붙일 수 있는거야
                // 색종이 붙이고 카운트 올리자

                // 색종이 개수 올려주자
                count[i]++;

                // 색종이 붙이자
                for (int row = px; row < px + i; row++) {
                    for (int col = py; col < py + i; col++) {
                        tmp[row][col] = 0;
                    }
                }


                // 다음 칸으로 출발하자
                dfs(r, c + 1, tmp);


                // 색종이 다시 돌려놓자
                for (int row = px; row < px + i; row++) {
                    for (int col = py; col < py + i; col++) {
                        tmp[row][col] = 1;
                    }
                }

                //색종이 개수 내려주자
                count[i]--;
            } // end outer for문
        } // end else
    } // end dfs함수

    
    // 색종이가 다 잘 붙어져있는지 즉 지도에서
    // 1인 부분이 없는거 확인
    static boolean check() {

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (tmp[r][c] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
