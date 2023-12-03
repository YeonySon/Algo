package sw역량테스트.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안경이없어7272 {
    static BufferedReader br;
    static StringTokenizer st;
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            arr1 = new int[26];
            arr2 = new int[26];


            st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();


            for (int i = 0; i < str1.length(); i++) {
                //만약에 B라면 그 인덱스에 111점을 플러스
                //만약에 ADOPQR라면 그 인덱스에 11점
                //그 외의 인덱스에 1점
                //위치도 다르면 다른거로 생각하는거라서 위치만 비교하면 될듯하다 총 가중치 점수가 아니라
                if (str1.charAt(i) == 'B') {
                    arr1[i] = 111;
                } else if (str1.charAt(i) == 'A' || str1.charAt(i) == 'D' || str1.charAt(i) == 'O' ||
                        str1.charAt(i) == 'P' || str1.charAt(i) == 'Q' || str1.charAt(i) == 'R') {
                    arr1[i] = 11;
                } else {
                    arr1[i] = 1;
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == 'B') {
                    arr2[i] = 111;
                } else if (str2.charAt(i) == 'A' || str2.charAt(i) == 'D' || str2.charAt(i) == 'O' ||
                        str2.charAt(i) == 'P' || str2.charAt(i) == 'Q' || str2.charAt(i) == 'R') {
                    arr2[i] = 11;
                } else {
                    arr2[i] = 1;
                }
            }

            if(Arrays.equals(arr1,arr2)){
                System.out.println("#"+tc+" SAME");
            } else {
                System.out.println("#"+tc+" DIFF");
            }
        }
    }
}
