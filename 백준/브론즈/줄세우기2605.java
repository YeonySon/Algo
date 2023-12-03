package 백준.브론즈;

import java.util.ArrayList;
import java.util.Scanner;

public class 줄세우기2605 {
    static Scanner sc;
    static ArrayList<Integer> list;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {

            int num = sc.nextInt();

            if (num == 0) {
                list.add(i + 1);
            } else {
                list.add(list.size() - num, i + 1);
            }
        }

        for (int n : list) {
            System.out.print(n + " ");
        }
    }
}
