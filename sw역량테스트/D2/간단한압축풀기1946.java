package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 간단한압축풀기1946 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            int N = Integer.parseInt(br.readLine());

            List<String> list = new ArrayList<>();
            for(int i=0; i<N; i++){

                String line = br.readLine();
                StringTokenizer st = new StringTokenizer(line);

                String word = st.nextToken();
                int res = Integer.parseInt(st.nextToken());
                for(int j=0; j<res; j++){
                    list.add(word);
                }
            }
            String[] arr = new String[list.size()];
            for(int i=0; i<list.size(); i++){
                arr[i] = list.get(i);
            }
            System.out.println("#"+tc);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
                //10개씩 끊기
                if(i%10 == 9)
                    System.out.println();
            }
            System.out.println();
        }
    }

}


