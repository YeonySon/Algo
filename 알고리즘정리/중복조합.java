package 알고리즘정리;

import java.util.Arrays;

public class 중복조합 {
    static int[] arr = {1,2,3,4};
    static int[] result = new int[2];

    public static void main(String[] args) {


        duplicateCombi(0,0);

    }

    private static void duplicateCombi(int idx, int cnt) {

        if(idx == 2){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i=cnt; i<4; i++){
            result[idx] = arr[i];
            duplicateCombi(idx+1,i);
        }


    }
}
