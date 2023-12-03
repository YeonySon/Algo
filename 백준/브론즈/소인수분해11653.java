package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해11653 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10000001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            for (int j = i * 2; j < arr.length; j += i) {
                arr[j] = 1;
            }
        }

        int num = Integer.parseInt(br.readLine()); // 번호받기

        //소수찾은배열 즉 0일때를 찾아서 소수인거만 나눈다
        //나눌때 그 나머지가 없으면 바로 출력
        //나눈거는 그거로 다시 num을 초기화
        //언제까지? num>1보다 클때까지


        while (num > 1) {

            for (int i = 2; i <= num; i++) {
                if (arr[i] == 0) {
                    while (num % i == 0) {
                        System.out.println(i);
                        num /= i;
                    }
                }
            }
        }
    }
}
