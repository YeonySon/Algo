package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 랜선자르기1654 {
    public static void main(String[] args) throws IOException {
        //이분탐색이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int len = Integer.parseInt(st.nextToken()); // 가지고있는 랜선개수
        int ans = Integer.parseInt(st.nextToken()); // 필요한 랜선개수

        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr); // 최대값이 필요하므로 정렬
        //21억까지 들어올수있으므로 long타입으로 길이 받자
        long max = arr[len-1];
        long min = 1; //문제에서 길이가 1이상이므로 최솟값은 1

        while (min<=max){
            long n = 0; // 자른개수 매번 초기화해야하므로 while문안에서
            long mid = (max+min)/2; // 맨 왼쪽과 맨 오른쪽 중간값
            
            //중간값으로 자른개수들 다 더해주기
            for(int i=0; i<len; i++){
                n += (arr[i]/mid);
            }
            
            if(n<ans){
                // 자른개수가 정답보다 작으면 더 잘게 썰어야하므로 맨 오른쪽 범위 중간값에-1한거로 줄인다
                max = mid-1;
            } else {
                min = mid+1;
            }
            
        }
        System.out.println(max);
    }
}
