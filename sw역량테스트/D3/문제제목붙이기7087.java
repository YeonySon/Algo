package sw역량테스트.D3;

import java.util.Scanner;

public class 문제제목붙이기7087 {
    static Scanner sc;
    static int[] arr;

    public static void main(String[] args) {

        //글자하나씩 받을 때 charat 해서 첫번째 글자를 받고 대문자니깐 거기에 65빼서
        //A~Z부터 배열인덱스 만들어서 그 첫글자의 인덱스에 1로바꿔준다
        //그러고 나서 포문돌면서 1이면 continue 0이면 밑에 다 0으로 만들어버리고 break;

        sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            arr = new int[26];  // A~Z까지 숫자로 배열
            int N = sc.nextInt(); // 단어개수

            for(int i=0; i<N; i++){
                String word = sc.next();
                int idx = word.charAt(0)-65;
                arr[idx] = 1;
            }

            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]==1){
                    count++;
                } else {
                    break;
                }
            }
            System.out.println("#"+tc+" "+count);
        }

    }
}
