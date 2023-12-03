package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브론즈2775부녀회장 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[15][15];

        //0층 완료, 각 층마다 1호 1로 고정
        for(int i=0; i<15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }
        //1층부터 2호부터 값 집어넣기
        //ex) 2층 3호
        // 2층 2호 + 1층3호
        for(int i=1; i<15; i++){
            for (int j=2; j<15; j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        for (int tc=1; tc<=t; tc++){
            //14층 14호 까지이므로 크기는15
            //층,호 받음
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());

            System.out.println(arr[floor][ho]);

        }


    }
}
