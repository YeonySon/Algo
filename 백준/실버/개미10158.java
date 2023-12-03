package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 개미10158 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

//        arr = new int[W + 1][H + 1];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine()); // 시간 즉 반복횟수

        // 우하, 우상, 좌상, 우상 이렇게 4번씩 반복이된다. 그래서 경계 벗어나지 않는 범위내에서 시간만큼 반복
        // 경계를 만나면 그 때 그 좌표에서 방향을 바꿔줌

        int[] dr = {+1, -1, -1, -1};
        int[] dc = {+1, +1, -1, +1};


        int xRes = (r+time)/W;
        int yRes = (c+time)/H;

        int x,y;
        if(xRes % 2 == 0){
            x = (r+time) % W;
        } else {
            x = W - ((r+time)%W);
        }

        if(yRes % 2 == 0){
            y = (c+time) % H;
        } else {
            y = H - ((c+time)%H);
        }
        sb = new StringBuilder();
        sb.append(x).append(" ").append(y);
        System.out.println(sb);


//        for (int i = 1, dir = 0; i <= time && dir <= time; i++) {
//
//            //우하먼저 시작
//
//            if (r < W + 1 && r >= 0 && c < H + 1 && c >= 0) {
//                r = r + dr[(dir) % 4];
//                c = c + dc[(dir) % 4];
//
//                if (r == W || r == 0 || c == H || c == 0) {
//                    if ((r == W && c == H) || (r == W && c == 0) || (r == 0 && c == 0) || (r == 0 && c == H)) {
//                        dir += 2;
//                    } else {
//                        dir++;
//                    }
//                }
//            }
//        }
//        System.out.println(r + " " + c);




    }
}
