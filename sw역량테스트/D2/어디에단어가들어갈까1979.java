package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 어디에단어가들어갈까1979 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int N = Integer.parseInt(st.nextToken());
            int findWord = Integer.parseInt(st.nextToken());//찾을단어길이
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String numbers = br.readLine();
                StringTokenizer st2 = new StringTokenizer(numbers, " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st2.nextToken());
                }
            }
            //오른쪽,아래로
            int[] dr = {0,+1};
            int[] dc = {+1,0};

            //자리탐색
            int count = 0;
            int r = 0;
            int c = 0;

            for(int i=0; i<N; i++){
                int rowcheck = 0;
                for(int j=0; j<N; j++){
                    if(arr[i][c+dc[0]*j]==1){
                        rowcheck++;
                    } else {
                        //0일 때
                        if(rowcheck==findWord){
                            count++;
                            // 0을 만났을 때 그 이전에 이미 만족하면
                            // count를 올리고 check를 0으로 해야만
                            // 마지막 if문에서 중복이 되지도 않고 또
                            // check를 할때 만약에 11101 일경우
                            // check가 4가 되므로 count를 못한다
                            rowcheck=0;
                        } else {
                            rowcheck=0;
                        }
                    }
                }
                if (rowcheck==findWord)
                    count++;
            }




            for(int i=0; i<N; i++){
                int colcheck = 0;
                for(int j=0; j<N; j++){
                    if(arr[r+dr[1]*j][i]==1){
                        colcheck++;
                    } else {
                        //0일 때
                        if(colcheck==findWord){
                            count++;
                            colcheck=0;
                        } else {
                            colcheck=0;
                        }
                    }
                }
                if (colcheck==findWord)
                    count++;
            }


            System.out.println("#" + tc + " " + (count));
        }
    }
}