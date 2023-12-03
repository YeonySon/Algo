package 알고리즘정리;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class KMP문자패턴매칭 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);



        // 접두사 접미사 테이블짜기
//        String str = "abacacba";
//        String pattern = "acac";

        String str = sc.next();
        String pattern = sc.next();

        int[] pi = makePi(pattern);
        char[] arr1 = str.toCharArray();
        char[] arr2 = pattern.toCharArray();

        int j = 0; // 포인터역할

        int cnt = 0;
        // 본 문자열 돌면서
        for (int i = 0; i < arr1.length; i++) {

            while (j > 0 && arr1[i] != arr2[j]) {
                j = pi[j - 1];
            }

            if (arr1[i] == arr2[j]) {

                // k는 한칸 뒤에 있다
                //
                if (j == arr2.length - 1) {
//                    System.out.println(i-arr2.length+2);
                    cnt++;
                    j = pi[j];
                } else {
                    j++;
                }
            }

        }

        if (cnt > 0)
            System.out.println(1);
        else
            System.out.println(0);

    }

    // 접두사 접미사 테이블짜기
    static int[] makePi(String str) {

        char[] array = str.toCharArray();
        int[] pi = new int[str.length()];
        int j = 0;
        for (int i = 1; i < str.length(); i++) {
            // 둘의 문자가 같으면 i와 j 둘다 같이 증가
            // 다르다면 j의 한칸전의 pi배열의 값
            // 이걸 index로 보고 거기로 j를 옮겨 그리고 다시 비교

            while (j > 0 && array[j] != array[i]) {
                j = pi[j - 1];
            }

            if (array[j] == array[i]) {
                pi[i] = ++j;
            }

        }
        return pi;
    }

}