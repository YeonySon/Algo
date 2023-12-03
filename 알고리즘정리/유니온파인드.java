package 알고리즘정리;

import java.util.Scanner;

public class 유니온파인드 {

    static int[] parent;

    public static void main(String[] args) {

        // 1. 자기자신을 부모로 설정
        // 2. findset 부모가 같은지 판단. 같지 않다면 union진행
        // 3. union

        // 1 2 3 4 5를 가지고 해보자


        parent = new int[6];
        for (int i = 1; i <= 5; i++)
            parent[i] = i;

//        int a = parent[find(a)];
//        int b = parent[find(b)];


    }

    static int find(int a) {

        if (a != parent[a])
            parent[a] = find(parent[a]);

        return parent[a];
    }

    // 숫자가 적은 놈으로 유니온해준다
    static void union(int a, int b) {

        if (a > b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }
}
