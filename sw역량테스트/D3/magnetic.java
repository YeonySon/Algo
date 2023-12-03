package sw역량테스트.D3;

import java.util.Scanner;

public class magnetic {
    public static void main(String[] args) {


        //1 이 n극 2는 s극
        //행렬 위쪽이 n극 그래서 2는 위쪽으로 한칸씩올라가고
        //아래쪽은 s극 그래서 1은 아래쪽으로 한칸씩 내려간다
        // 결국 열마다 12가 붙어있으면 된다 그거 찾기
        //1을 먼저 찾고그다음 2가 있으면 count올려주고 continue
        //다시 1을 찾고 그 다음 2찾기
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {

            int N = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            int count = 0;
            for (int c = 0; c < N; c++) {
                for (int r = 0; r < N; r++) {
                    if (arr[r][c] == 1) {
                        //밑으로내려가는데 첨으로 1을 만나면 continue
                        //밑으로 내려가면서 2을 만나면 그때 카운트하고 continue

                        for (int i = r + 1; i < N; i++) {
                            if (arr[i][c] == 1) {
                                break;
                            } else if (arr[i][c] == 2) {
                                count++;
                                break;
                            }

                        }
                    }
                }
            }

            System.out.println("#" + tc + " " + count);
        }
    }
}
