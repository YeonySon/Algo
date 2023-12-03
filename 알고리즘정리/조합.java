package 알고리즘정리;

import java.util.Arrays;

public class 조합 {

    static int[] arr = {1, 2, 3, 4};
    static int[] result = new int[2];

    public static void main(String[] args) {

        combi(0, 0); // 인덱스, 횟수


    }

    private static void combi(int idx, int cnt) {

        //기저조건
        if (idx == 2) {
            System.out.println(Arrays.toString(result));
            return; // 종료
        }

        //이제 돌자
        for (int i = cnt; i < 4; i++) { // 중복되는거 막기위해 i는 cnt부터 시작한다
            result[idx] = arr[i];
            combi(idx + 1, i + 1);
        }


    }

}
