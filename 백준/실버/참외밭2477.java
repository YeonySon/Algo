package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 참외밭2477 {
    public static void main(String[] args) throws IOException {
        //1 : 동쪽
        //2 : 서쪽
        //3 : 남쪽
        //4 : 북쪽

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 평당참외개수

        int[] dir = new int[6]; //방향
        int[] len = new int[6]; //길이

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dir[i] = Integer.parseInt(st.nextToken());
            len[i] = Integer.parseInt(st.nextToken());
        }

        int maxWidth = Integer.MIN_VALUE; // 가로길이최대
        int mwIdx = Integer.MIN_VALUE; // 가로길이최대일때 인덱스
        int maxHeight = Integer.MIN_VALUE; // 세로길이 최대
        int mhIdx = Integer.MIN_VALUE; // 세로길이 최대일때 인덱스
        for (int i = 0; i < 6; i++) {
            //가로방향
            if (dir[i] == 1 || dir[i] == 2) {
                if (len[i] > maxWidth) {
                    maxWidth = len[i];
                    mwIdx = i;
                }

            } else {
                if (len[i] > maxHeight) {
                    maxHeight = len[i];
                    mhIdx = i;
                }
            }
        }

        int maxArea = maxWidth * maxHeight; // 최대사각형넓이

        int width = (mwIdx + 3) % 6; // 작은사각형가로
        int height = (mhIdx + 3) % 6; // 작은사각형세로

        int minArea = len[width] * len[height];

        int result = maxArea - minArea;

        System.out.println(result * N);

    }
}
