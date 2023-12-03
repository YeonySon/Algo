package 백준.실버;

import javax.xml.stream.events.StartDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기2579 {

    static BufferedReader br;
    static int[] arr; // 층수배열
    static int[] stairs;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 계단 수
        arr = new int[N+1]; // 0층인거 포함해야함
        stairs = new int[N+1];

        //층수넣기
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        stairs[0] = arr[0]; // 시작이 0층부터이므로
        stairs[1] = arr[1];

        //계단이 2개 이상일때 if문 빼고 해두면 계단이 1개일 때 에러발생
        if (N >= 2) {
            stairs[2] = arr[0] + arr[1] + arr[2];
        }

        // 만약 N층일 때
        // 경우의 수 2가지 N-2에서 한번에 2칸 가는거
        // N-3에서 N-1칸 가고 가는 경우의 수
        // 이 경우의 수 2가지 중에 여태것 총 층수합이 최대값인거를 찾고
        // 거기에 마지막 층을 더해주면 그게 최댓값
        for(int i=3; i<=N; i++){
            stairs[i] = Math.max(stairs[i-2], stairs[i-3]+arr[i-1]) + arr[i];
        }

        System.out.println(stairs[N]); //출력
    }
}
