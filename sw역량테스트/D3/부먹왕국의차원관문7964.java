package sw역량테스트.D3;

import java.io.IOException;
import java.util.Scanner;

public class 부먹왕국의차원관문7964 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {

            int N = sc.nextInt(); // 도시개수
            int len = sc.nextInt(); // 제한거리

            int[] arr = new int[N + 2]; // 맨 처음과 맨뒤는 차원문이 있다고 문제에서 주워짐

            arr[0] = 1;
            arr[N + 1] = 1;
            //처음과 끝은 1 로 나머지는 주어진 값 집어넣기
            for (int i = 1; i < N + 1; i++)
                arr[i] = sc.nextInt();

            //1일때 인덱스의 차이가 주어진 제한 거리보다 많으면
            //그 차이를 제한거리로 나누고 count올려준다, before after변수 활용
            //이렇게 했더니 10001에서 제한거리가2일때 한 개만 있으면 되는데 2개로 되어서 최소 충족x
            //일단 1을찾고 거기서 len만큼 더한 인덱스에도 1이 있으면 또는 연속적으로 1이면 continue 근데 만약에 0이다 그러며
            //1일로 바꿔주고 break하고 다시 1일로 바꾼데 부터 시작하여서 고
            //

            int count = 0;
            flag : for (int i = 0; i < N-len+1; i++) {
                if(arr[i]==1){
                    for (int j = 1; j <= len; j++) {
                        if(arr[i+j]==1){
                            continue flag;
                        }
                    }
                    arr[i+len] = 1;
                    count++;

                }
            }
            System.out.println("#" + tc + " " + count);
        }
    }

}
