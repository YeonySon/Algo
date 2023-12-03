package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 실버2563색종이 {
    public static void main(String[] args) throws IOException {

        //2차배열을 만들어 입력받는 곳을 시작점으로 +10만큼씩 만듬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[100][100]; //전체 도화지

        int t = Integer.parseInt(br.readLine()); // 입력받는 라인 수
        for(int n=0; n<t; n++) {

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            //속한 구역을 1로 더해준다
            //그래서 혹시 겹치게 되면 2이상이 된다
            for (int i = row; i < row + 10; i++) {
                for (int j = col; j < col + 10; j++) {
                    arr[i][j]++;
                }
            }
        }
        //겹치는 개수 구하기
        int count = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                //겹칠때
                //그냥 1이상인 구역을 다 출력해줘도 됨
                //여기서는 1번만 겹치므로
                if(arr[i][j] > 0)
                    count++;

                //2번이상 겹칠경우
                //겹친횟수-1만큼 빼줘야한다
//                if(arr[i][j]>1){
//                    count += arr[i][j]-1;
//                }
//                System.out.println(100*t - count);
            }
        }
        System.out.println(count);
    }
}
