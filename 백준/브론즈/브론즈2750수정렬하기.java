package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 브론즈2750수정렬하기 {
    public static void main(String[] args) throws IOException {
        //선택정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<N-1; i++){
            int minIdx = i; // 항상 첫번째가 최소라 가정
            // 첫번째 제외하고 그 다음부터 비교
            for(int j=i+1; j<N; j++){
                if (arr[minIdx]>arr[j])
                    minIdx=j;

            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        for(int a : arr){
            System.out.println(a);
        }


    }
}
