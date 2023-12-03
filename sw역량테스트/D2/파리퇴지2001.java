package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파리퇴지2001 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {

            String n = br.readLine();
            StringTokenizer st = new StringTokenizer(n, " ");
            int N = Integer.parseInt(st.nextToken());
            int fly = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                StringTokenizer s = new StringTokenizer(line, " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(s.nextToken());
                }
            }

            int max = 0;
            for (int i = 0; i < N - fly + 1; i++) {
                for (int j = 0; j < N - fly + 1; j++) {
                    int sum = 0;
                    for (int x = 0; x < fly; x++) {
                        for (int y = 0; y < fly; y++) {
                            sum += arr[x + i][y + j];
                        }
                    }
                    if (sum > max)
                        max = sum;
                }

            }
            System.out.println("#"+tc +" "+ max);
        }

    }
}
