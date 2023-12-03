package sw역량테스트.D3;

import java.util.Scanner;

public class 오목 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            int N = sc.nextInt(); //행렬크기

            String[][] arr = new String[N][N];

            // 집어넣기
            for (int r = 0; r < arr.length; r++) {
                String line = sc.next();
                for (int c = 0; c < arr.length; c++) {
                    arr[r][c] = line.substring(c, c + 1);
                }
            }

            //델타이용
            //상 하 좌 우 / 오른대위 / 오른대아 / 왼대위 / 왼대아
//            int[] dr = {-1,+1,0,0,-1,+1,-1,+1};
//            int[] dc = {0,0,-1,+1,+1,+1,-1,-1};
            //하 오  오른대각아래 오른대각선위
            int[] dr = {+1,0,+1,-1};
            int[] dc = {0,+1,+1,+1};

            //돌을 "o" 찾고 그 점을 기준으로 밑에 오른쪽 대각선오른아래 왼쪽아래대각선
            //그전에는 이미 검사를 하고 넘어온거기에
            //델타 오른쪽으로 돌려서 연속으로 돌이 4개나오면 된다.
            int check =0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    //돌맹이 찾음
                    if(arr[r][c].equals("o")){
                        System.out.println(r+" "+c);
                        //델타이용
                        check = 1;
                        //4번찾기
                        for(int i=0; i<4; i++){
                            for(int j=0; j<4; j++) {
                                int deltaR = r+dr[j];
                                int deltaC = c+dc[j];
                                if (deltaR<N && deltaC<N && deltaC >-1) {
                                    if (arr[deltaR][deltaC].equals("o")) {
                                        //0찾은곳 좌표다시 초기화
                                        r = r + dr[j];
                                        c = c + dc[j];
                                        check++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (check>=5)
                System.out.println("#"+tc+" YES" + " " + check);
            else
                System.out.println("#"+tc+" NO" + " " + check);


        }
    }
}
