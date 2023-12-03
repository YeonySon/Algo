package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 참외밭 {
    public static void main(String[] args) throws IOException {

        //1 : 동쪽
        //2 : 서쪽
        //3 : 남쪽
        //4 : 북쪽

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int res = Integer.parseInt(br.readLine()); // 1제곱미터당 참외개수

        //최대 500만큼 움직이니깐
        //가운데를 0으로 기준으로 양옆 위아래 500만큼 움직이니
        //행렬을 1001 2차원을 만들어
        //가운데 인덱스에서 점을 찍고 움직인다.

        int[][] arr = new int[1001][1001];
        int midRow = 500;
        int midCol = 500;
        //육각형이므로 6번 움직임
        for(int tc=1; tc<=6; tc++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());

            //델타이용 처음은 빈공간
            int[] dr = {0,0,0,+1,-1};
            int[] dc = {0,+1,-1,0,0};

            int row = 0;
            int col = 0;
            //지금 둘레만 1로 되어있따. 넓이를 구하자
            for(int i=1; i<=len; i++){
                arr[midRow+(dr[dir]*i)][midCol+(dc[dir]*i)] = 1;
                row = midRow+(dr[dir]*i);
                col = midCol+(dc[dir]*i);
            }
            midRow = row;
            midCol = col;
            System.out.println(row);
            System.out.println(col);

        }
        int count = 0;
        for(int r=0; r<1001; r++){
            for(int c=0; c<1001; c++){
                if(arr[r][c]>0) count++;
            }
        }
        System.out.println(count);
        System.out.println(count*res);



    }
}
