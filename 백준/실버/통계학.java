package 백준.실버;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 통계학 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        double average = 0;
        double total = 0;
        for(int i=0; i<N; i++) {
            total += arr[i];
        }
        average = total / N;


        //산술평균
        System.out.println((int) Math.round(average));


        //길이는 홀수
        Arrays.sort(arr);
        int mid = N/2;
        //중앙값
        System.out.println(arr[mid]);


        //카운트배열
        int[] count = new int[8001]; //-4000~4000

        for(int i=0; i<arr.length; i++) {
            count[arr[i]+4000]++; //-4000부터니깐
        }
        int maxCount = 0;
        for(int i=0; i<8001; i++){
            maxCount = Math.max(maxCount,count[i]);
        }
        //빈도수같은 경우 대비하여 list사용
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<8001; i++){
            if(count[i]==maxCount)
                list.add(i-4000);
        }
        //삼항연산자 이용하여 size가 1초과라는 것은 빈도수 같은게 2개이므로
        //두번째로 작은거 출력
        System.out.println(list.size() > 1 ? list.get(1) : list.get(0));



        //범위
        System.out.println(arr[arr.length-1] - arr[0]);


    }

}
