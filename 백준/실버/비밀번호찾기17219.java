package 백준.실버;

import java.util.HashMap;
import java.util.Scanner;

public class 비밀번호찾기17219 {
    static Scanner sc;
    static HashMap<String,String> hashMap;


    public static void main(String[] args) {
        sc = new Scanner(System.in);
        hashMap = new HashMap<>();
        int N = sc.nextInt(); // 주소개수
        int target = sc.nextInt(); // 찾아야할 비번개수

        for(int i=0; i<N; i++){
            hashMap.put(sc.next(), sc.next());
        }

        for(int i=0; i<target; i++){
            String url = sc.next();
            if(hashMap.containsKey(url)){
                System.out.println(hashMap.get(url));
            }
        }


    }

}
