package 알고리즘정리;

import java.util.Arrays;

public class 중복순열 {
    static int[] arr = {1,2,3,4};
    static int[] result = new int[2];

    public static void main(String[] args) {

        duplicatePerm(0);

    }

    private static void duplicatePerm(int idx) {

        if(idx==2){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i=0; i<4; i++){
            result[idx] = arr[i];
            duplicatePerm(idx+1);
        }


    }

}
