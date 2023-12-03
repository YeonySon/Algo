package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 실버1316그룹단어체커{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        
        //처음 시작할때부터 아예 입력받는 단어 개수로 count 초기화
        int count = t;

        for (int tc = 1; tc <= t; tc++) {
            String word = br.readLine();
            
            //각 알파벳에 맞게  체크
            boolean[] check = new boolean[26];

            for (int i = 0; i < word.length() - 1; i++) {//i 번째와 i+1번째 비교위해 length-1
                //ex aba
                //i번째 i+1번째 비교하고 다르면 i+1번째가 true인게 있으면
                //break하고 count--해서 줄인다
                if (word.charAt(i) != word.charAt(i + 1)) {
                    if (check[word.charAt(i + 1) - 97] == true) {
                        count--;
                        break;
                    }
                }
                //맞는 index에 true 초기화
                check[word.charAt(i) - 97] = true;
            }
        }
        System.out.println(count);

    }
    }


