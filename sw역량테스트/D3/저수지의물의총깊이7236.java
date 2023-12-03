package sw역량테스트.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 저수지의물의총깊이7236 {
    static BufferedReader br;
    static StringTokenizer st;
    static String[][] arr;


    public static void main(String[] args) throws IOException {

        //w일때 8방을 다 확인해서 w가있으면 count 만약에 count가 0 이면 g로 가득 둘러쌓여있는것이므로 count=1
        //count 할 때마다 최대값 비교해서 저장

        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {

            int N = Integer.parseInt(br.readLine());
            arr = new String[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = st.nextToken();
                }
            }

            //상하좌우 우상우하 좌상좌우
            int[] dr = {-1, +1, 0, 0, -1, +1, -1, +1};
            int[] dc = {0, 0, -1, +1, +1, +1, -1, -1};

            int max = Integer.MIN_VALUE;
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (arr[r][c].equals("W")) {
                        int count = 0;
                        for (int i = 0; i < 8; i++) {
                            int R = r + dr[i];
                            int C = c + dc[i];
                            if (R >= 0 && R < N && C >= 0 && C < N) {
                                if(arr[R][C].equals("W"))
                                    count++;
                            }
                        }
                        max = Math.max(max,count);
                    }
                }
            }
            if (max==0)
                max = 1;
            System.out.println("#"+tc+" "+max);
        }
    }
}
