package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브론즈2566배열최대값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        //하나씩 배열에 집어넣는다
        for (int i = 0; i < 9; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //최댓값을 찾는다
        int maxNum = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                maxNum = Math.max(arr[i][j], maxNum);
                //인덱스도 포함
                if (maxNum==arr[i][j]){
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(maxNum);
        System.out.println(row+1);
        System.out.println(col+1);

        //최대값일 때의 몇행 몇열인지 가져오기
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (maxNum == arr[i][j])
//                    System.out.println((i + 1) + " " + (j + 1));
//                     break;
//            }
//        }
    }
}

