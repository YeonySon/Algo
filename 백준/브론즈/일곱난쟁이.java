package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //브루트포스
        //7개뽑아서 합산이 100 되는 순간
        //break 하고 sort
        int[] ans = new int[7];
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j != i) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            for (int l = 0; l < 9; l++) {
                                if (l != i && l != j && l != k) {
                                    for (int m = 0; m < 9; m++) {
                                        if (m != i && m != j && m != k && m != l) {
                                            for (int n = 0; n < 9; n++) {
                                                if (n != i && n != j && n != k && n != l && n != m) {
                                                    for (int p = 0; p < 9; p++) {
                                                        if (p != i && p != j && p != k && p != l && p != m && p != n) {
                                                            if (arr[i] + arr[j] + arr[k] + arr[l] + arr[m] + arr[n] + arr[p] == 100) {

                                                                ans[0] = arr[i];
                                                                ans[1] = arr[j];
                                                                ans[2] = arr[k];
                                                                ans[3] = arr[l];
                                                                ans[4] = arr[m];
                                                                ans[5] = arr[n];
                                                                ans[6] = arr[p];

                                                                break outer;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Arrays.sort(ans);

        for (int num : ans) {
            System.out.println(num);
        }
    }
}
