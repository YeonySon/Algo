package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 비밀이메일 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //받은 단어개수로 행렬크기 만들기 단 행은 열보다 작거나 같다.

        String word = br.readLine();
        int size = word.length();
        
        //열 크기 넘지 않는 행크기 구하기
        int r = 0;
        int c = 0;

        for(int i= (int)Math.sqrt(size); i>=1; i--){
            if(size%i==0){
                r=i;
                break;
            }
        }
        c=size/r;


//        System.out.println(r+" "+c);



        //구한 행열을 가로가 아닌 세로로 집어넣고 출력할때는 가로로 출력
        char[][] arr = new char[r][c];
        char[] arr2 = word.toCharArray();
        int k = 0;
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                arr[j][i] = arr2[k];
                k++;
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]);
            }
        }





    }
}
