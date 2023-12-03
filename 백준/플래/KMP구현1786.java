package 백준.플래;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KMP구현1786 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine();
        String pattern = br.readLine();

        int[] pi = makePi(pattern);
        char[] arr1 = str.toCharArray();
        char[] arr2 = pattern.toCharArray();

        int j = 0; // 포인터역할

        int cnt = 0;
        List<Integer> list = new ArrayList<>(); // 같은 문자열 찾을 때 위치 저장용
        // 본 문자열 돌면서
        for (int i = 0; i < arr1.length; i++) {

            while (j > 0 && arr1[i] != arr2[j]) {
                j = pi[j - 1];
            }

            if (arr1[i] == arr2[j]) {

                // k는 한칸 뒤에 있다
                //
                if (j == arr2.length - 1) {
                    cnt++;
                    list.add(i-arr2.length+2);
                    j = pi[j];
                } else {
                    j++;
                }

            }

        }
        System.out.println(cnt);
        for(int num : list)
            System.out.print(num + " ");
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