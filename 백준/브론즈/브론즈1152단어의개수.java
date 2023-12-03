package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 브론즈1152단어의개수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String word = br.readLine(); // 한줄씩 읽기
        
        //공백을 기준으로 토큰화
        StringTokenizer st = new StringTokenizer(word," ");
        
        //토큰개수 출력
        System.out.println(st.countTokens());


    }
}
