package 백준.골드;

import java.util.Arrays;
import java.util.Scanner;

public class 암호만들기1759 {
    static Scanner sc;
    static String[] arr;
    static String[] result;
    static boolean[] visit;
    static int M;
    static int N;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();

        arr = new String[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.next();

        Arrays.sort(arr);

        result = new String[M];
        visit = new boolean[N];

        dfs(0, 0);


    }

    private static void dfs(int start, int idx) {

        if (idx == M) {
            String word = "";
            for (int i = 0; i < M; i++) {
                word += result[i];
            }
            
            // 모음 a e i o u 최소1개 포함 && 자음 최소두개
            int check1 = 0; // 모음개수
            int check2 = 0; // 자음개수
            
            for(int i=0; i<M; i++){
                char ch = word.charAt(i);
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    check1++;
                } else{
                    check2++;
                }
            }

            if(check1>=1 && check2>=2)
                System.out.println(word);
            
            return;
        }

        for (int i = start; i < N; i++) {

            if (visit[i] == false) {

                visit[i] = true;
                result[idx] = arr[i];
                dfs(i, idx + 1);
                visit[i] = false;

            }
        }
    }
}
