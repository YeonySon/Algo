package 백준.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS9251 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        // 표를 그려서 각 행과 열의 문자가 같다면 행-1 열-1 의 원소값에 +1
        // 같지 않다면 위랑 왼쪽이랑 비교해서 큰 값을 해준다.
        int[][] arr = new int[word1.length() + 1][word2.length() + 1]; // 한칸 크게 설정해줘서 -1 아예 제외한다
        arr[0][0] = 0;
        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        System.out.println(arr[word1.length()][word2.length()]);
    }
}
