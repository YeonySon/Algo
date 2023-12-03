package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 좌표압축18870 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] arr;
    static int[] arr2;
    static HashMap<Integer,Integer> hashMap;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N];
        arr2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]= arr2[i]= Integer.parseInt(st.nextToken());
        }

        //수직선 생각했을 때 숫자가 작은 수가 0순위
        //그래서 일단 정렬을 하고 그 값에 따라서 hashmap에 key값을 넣고 0부터 차례대로 순위넣어줌
        Arrays.sort(arr2);

        hashMap = new HashMap<>();
//        hashMap.put(arr[0],0); // 항상 맨 앞은 먼저 넣고시작
//        for(int i=1; i<N; i++){
//            if(arr[i]==arr[i-1]){
//                hashMap.put(arr[i],hashMap.get(arr[i]));
//            } else {
//                hashMap.put(arr[i],hashMap.get(arr[i-1])+1);
//            }
//        }
//        for(int i=0; i<N-1; i++){
//            System.out.print(hashMap.get(arr2[i])+" ");
//        }
//        System.out.print(hashMap.get(arr2[N-1]));
        int r = 0;
        for(int num : arr2){
            if(!hashMap.containsKey(num)){ // 해쉬맵에 이미 키값으로 없으면 집어넣고 랭크 설정해주기
                // 예를들어 같은수인 4가 2번 들어가면 4는 rank가 이미 설정되었으므로 두번째4는 굳이 안 해줘도 된다
                hashMap.put(num,r);
                r++;
            }
        }
        sb = new StringBuilder();

        for(int num : arr){
            sb.append(hashMap.get(num)+" ");
        }
        System.out.println(sb);


    }

}
