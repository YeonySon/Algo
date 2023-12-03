package 백준.실버;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class 나는야포켓몬마스터1620 {
    static Scanner sc;
    static HashMap<String,String> hashMap;
    static List<String> list;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int N = sc.nextInt(); // 포켓몬도감
        int find = sc.nextInt();
        hashMap = new HashMap<>();
        list = new ArrayList<>();

        for(int i=1; i<=N; i++){
            String str = sc.next();
            hashMap.put(str, String.valueOf(i));
            list.add(str);
        }

        for(int i=0; i<find; i++){

            String str = sc.next();
            if (hashMap.containsKey(str)){
                System.out.println(hashMap.get(str));
            } else {
                //만약 키밸류가 아니면 밸류값으로 판단
                System.out.println(list.get(Integer.parseInt(str)-1));

            }
        }
    }

}
