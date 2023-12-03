package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {

        //길이 우선순위
        //길이 같으면 사전순
        //중복단어는 하나 제거해서 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] arr = new String[t];
        for(int i=0; i<t; i++){
            arr[i] = br.readLine();
        }
        
        //익명함수사용
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //길이 같을 경우
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }else
                    return o1.length()-o2.length();
            }
        });
        
        //중복되지 않을때 값만 출력
        for(int i=0; i<t-1; i++){
            if(!arr[i].equals(arr[i+1]))
                System.out.println(arr[i]);
        }
        //마지막 idx 출력
        System.out.println(arr[t-1]);




    }
}
