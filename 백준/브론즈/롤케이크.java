package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 롤케이크 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int people = Integer.parseInt(br.readLine());

        //롤케이크 배열생성
        int[] arr = new int[N];
        
        //배열에 인덱스만큼 넣어주기
        
        //예상개수 -> last - first 젤 큰 값
        //실제는 배열에서 개수 찾기

        int preMax = Integer.MIN_VALUE;
        int preMaxIdx = 0;
        int[] count = new int[N+1];
        int realMaxIdx = 0;
        int realMax = Integer.MIN_VALUE;
        int[] pre = new int[people+1];
        for(int i=1; i<=people; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int lastNum = Integer.parseInt(st.nextToken());

            for (int j=firstNum-1; j<lastNum; j++){
                if(arr[j]==0){
                    arr[j] = i;
                    count[i]++;
                } else continue;
            }

            int num = lastNum-firstNum;
            pre[i]=num;

        }

        for(int k=0; k<pre.length; k++){
            if (pre[k]>preMax){
                preMax=pre[k];
                preMaxIdx=k;
            }
        }

        for(int i=0; i<count.length; i++){
            if (count[i]>realMax){
                realMax=count[i];
                realMaxIdx=i;
            }
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(count));
        System.out.println(preMaxIdx);
        System.out.println(realMaxIdx);



    }
}
