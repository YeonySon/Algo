package 백준.실버;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 편의점투쁠원11508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] arr1 = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1, Collections.reverseOrder());


        int sum = 0;
        for (int i = 0; i < N; i++) {

            if ((i + 1) % 3 == 0) {
                continue;
            }
            sum += arr1[i];

        }

        System.out.println(sum);

    }

}
