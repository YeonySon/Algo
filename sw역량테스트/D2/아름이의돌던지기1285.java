package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.StringTokenizer;

public class 아름이의돌던지기1285 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line," ");
            
            //배열에 집어넣기
            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            //절대값으로 거리 만들고 최솟값 구하기
            int min = Math.abs(arr[0]);
            for(int i=0; i<N; i++){
                int length = Math.abs(arr[i])-0;
                if(min>length)
                    min=length;
            }
            
            //최소거리 나올때의 수를 count하기
            int count = 0;
            for(int i=0; i<N; i++){
                if(min==Math.abs(arr[i]))
                    count++;
            }
            System.out.println("#"+tc+" "+min+" "+count);
        }
    }
}
