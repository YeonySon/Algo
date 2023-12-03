package 알고리즘정리;

import java.util.Arrays;

public class 순열 {
    static int[] arr = {1,2,3,4};
    static int[] result = new int[3];
    static boolean visit[] = new boolean[4];
    
    // 순서가 중요하므로 123 213 다른거임 조합에서는 두개 다 같은 거로 봄

    public static void main(String[] args) {

        perm(0);

    }

    private static void perm(int idx) {

        if(idx == 3){
            System.out.println(Arrays.toString(result));
            return;
        }

        for(int i=0; i<4; i++){
            if(visit[i]) continue;

            visit[i] = true;
            result[idx] = arr[i];
            perm(idx+1);
            visit[i] = false;

        }


    }


}
