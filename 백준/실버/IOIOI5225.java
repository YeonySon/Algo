package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOIOI5225 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cntO = Integer.parseInt(br.readLine()); // 0의 개수
        int len = Integer.parseInt(br.readLine()); // 문자열 길이
        String str = br.readLine(); // 문자열 받기

        //문자열 받아서 일단 O인부분 찾기
        char[] arr = str.toCharArray();
        int check = 0;
        int realCnt = 0;

        for (int i = 1; i < len - 1; i++) {
            if (arr[i - 1] == 'I' && arr[i] == 'O' && arr[i + 1] == 'I') {
                check++;

                //만약 IOI면 실제 COUNT에 더해주고 CHECK--해준다 그이유는 그 다음에도 있을 수 있으므로
                if (check == cntO) {
                    realCnt++;
                    check--;
                }
                i++; //ioi반복되므로 o 인 위치에서 +2해준거는 또 0 일거임
            } else {
                check = 0;
            }
        }
        System.out.println(realCnt);
    }
}
