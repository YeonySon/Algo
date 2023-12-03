package 백준.브론즈;

import java.io.*;
import java.util.StringTokenizer;

public class 브론즈10951 {
    public static void main(String[] args) throws IOException {
        //A+B인데 더이상 출력 없을때 가정 근데 이거 실행하면 NOSUCH예외 발생하는데 이거는 키보드입력일시에만 발생하므로 컴퓨터는 문제 없다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while ((str=br.readLine()) !=null){
                st = new StringTokenizer(str,",");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a+b).append("\n");
        }
        System.out.println(sb);
    }
}
