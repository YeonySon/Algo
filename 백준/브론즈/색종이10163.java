package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class 색종이10163 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //도화지
        int[][] arr = new int[1001][1001];

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int rowStart = Integer.parseInt(st.nextToken());
            int colStart = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int r = rowStart; r < rowStart + width; r++) {
                for (int c = colStart; c < colStart + height; c++) {
                    arr[r][c] = tc;
                }
            }

        }


        //한번 겹치면 2, 두번 겹치면 3
        //1일 때는 1번
        //2일 때는 2번 된것들 개수 출력
        for (int i = 1; i <= T; i++) {
            int cnt = 0;
            for (int r = 0; r < 1001; r++) {
                for (int c = 0; c < 1001; c++) {
                    if (arr[r][c] == i)
                        cnt++;
                }
            }
            System.out.println(cnt);
        }


    }
}
