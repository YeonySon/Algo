package 백준.골드;

import java.util.ArrayList;
import java.util.Scanner;

public class 치킨배달15686 {
    static Scanner sc;
    static int N;
    static int M;
    static int[][] arr;
    static boolean[] visit;
    static ArrayList<int[]> house; // 좌표저장용
    static ArrayList<int[]> chicken; // 좌표저장용

    static int min;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt(); // 치킨집 개수

        arr = new int[N][N];

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(arr[r][c]==1)
                    house.add(new int[]{r,c});

                if(arr[r][c]==2)
                    chicken.add(new int[]{r,c});
            }
        }

        visit = new boolean[chicken.size()];
        min = Integer.MAX_VALUE;
        dfs(0,0);
        System.out.println(min);







    }

    private static void dfs(int start, int idx) {

        if(idx == M){
            int num = 0;

            for(int i=0; i< house.size(); i++){
                int tmp = Integer.MAX_VALUE;
                for(int j=0; j<chicken.size(); j++){
                    if(visit[j]){

                        int len = Math.abs(house.get(i)[0] - chicken.get(j)[0]) + Math.abs(house.get(i)[1] - chicken.get(j)[1]);

                        tmp = Math.min(tmp,len);
                    }
                }
                num += tmp;
            }

            min = Math.min(num,min);
            return;
        }

        for(int i=start; i<chicken.size(); i++){

            visit[i] = true;
            dfs(i+1,idx+1);
            visit[i] = false;
        }



    }

}
