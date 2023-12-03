package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 브론즈1546평균 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        double total = 0;
        for(int i=0; i<N; i++){
            arr[i]=arr[i]/arr[N-1] * 100;
            total += arr[i];
        }
        double result = total/N;
        System.out.println(result);


    }
}
