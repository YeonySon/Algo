package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class 트리의부모찾기11725 {

    static int[] parent;
    static int N;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        parent = new int[N+1];

        for(int i=1; i<=N; i++)
            parent[i] = i;

        for(int i=1; i<N; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(parent[find(a)] != parent[find(b)]){
                union(a,b);
            }
            System.out.println(Arrays.toString(parent));
        }




    }


    static int find(int a){

        if(a != parent[a])
            parent[a] = find(parent[a]);

        return parent[a];


    }

    static void union (int a, int b){

        if(a< b){
            parent[b] = a;
        } else {
            parent[a] = b;
        }

    }

}
