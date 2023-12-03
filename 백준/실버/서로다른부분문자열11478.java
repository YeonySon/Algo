package 백준.실버;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class 서로다른부분문자열11478 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        HashSet<String> set = new HashSet<>();

        // TreeSet<String> set = new TreeSet<>();

        // 단어 한 개씩, 두개, 세개 차례로 늘리면서 가기
        // 예를들어 abc 면
        // a , b , c , ab, bc, abc 이런 식으로


        for(int i=0; i<str.length(); i++){
            String word = "";
            for(int j=i; j<=j+i && j<str.length(); j++){
                word += String.valueOf(str.charAt(j));
               // System.out.println(word);
                set.add(word);
            }
        }
        System.out.println(set.size());
    }
}
