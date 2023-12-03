package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식2156 {
    static BufferedReader br;
    static int[] arr; // 포도주
    static int[] grape; // 포도주총합

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 포도주개수
        arr = new int[N+1]; // 포도주잔 1개이상이라 걍 인덱스 맞춰주려고 첫번째 잔
        grape = new int[N+1];

        //층수넣기
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        grape[0] = arr[0]; // 0번은 필요 없으므로
        grape[1] = arr[1]; // 첫번째 잔의 최대값은 본인자신

        //포도주잔 2개 이상일때 if문 빼고 해두면 포도주잔이 1개일 때 에러발생
        if (N >= 2) {
            grape[2] = arr[0] + arr[1] + arr[2];
        }

        //마지막 포두잔에 든걸 굳이 선택을 안 해도 이미 최대값이 되면 된다.
        //만약 N개 있다고 하면
        // N-1일 때 최대
        // N-2 일때 + arr[N]
        // N-3 arr[n-1] + arr[n]
        for(int i=3; i<=N; i++){
            grape[i] = Math.max(grape[i-1], Math.max(grape[i-2] + arr[i], grape[i-3] + arr[i-1] + arr[i]));
        }

        System.out.println(grape[N]); //출력
    }
}
