package 백준.골드;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 인구이동16234 {

    static int[][] arr;
    static boolean[][] visit;
    static int N;
    static int min;
    static int max;
    static List<int[]> list;
    // 상하좌우
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 인구지도 크기
        arr = new int[N][N];

        min = sc.nextInt(); // 범위 최소
        max = sc.nextInt(); // 범위 최대

        // 인구 지도 받자
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                arr[r][c] = sc.nextInt();
            }
        }

        // 더이상 움직일 수 없을 때 까지 이동하면서
        // 연합군 만들자

        int day = 0; // 인구이동이 며칠?
        outer:
        while (true) {
            visit = new boolean[N][N]; // 방문처리


            if (check()) {
                list = new ArrayList<>(); // 연합한곳들 위치 넣어주자
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        if (!visit[r][c]) {
                            bfs(r, c);
                            // 연합끝나고 나서 리스트에 담겨진 size가 2부터는
                            // 연합이 있는 것이므로 그 때 인구 갱신해주자
                            if (list.size() > 1) {
                                changeMap(); // 연합 다 마무리하고 인구 변화 해주자
                               // print();

                            }
                            list.clear();
                        }
                    }
                } // end for문
            } else {
                break outer;
            }
            day++;
        }
        System.out.println(day);
    }

    private static boolean check() {

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                for (int i = 0; i < 4; i++) {
                    int R = r + dr[i];
                    int C = c + dc[i];

                    if (R >= 0 && C >= 0 && R < N && C < N) {
                        int diff = Math.abs(arr[r][c] - arr[R][C]);
                        if (diff >= min && diff <= max) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static void print() {
        // TODO Auto-generated method stub
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

    }

    private static void bfs(int r, int c) {
        // TODO Auto-generated method stub
        Queue<int[]> q = new LinkedList<>();


        q.add(new int[]{r, c});
        visit[r][c] = true;

        while (!q.isEmpty()) {

            int[] pick = q.poll();
           // System.out.println(pick[0] + " " + pick[1]);
            list.add(new int[]{pick[0], pick[1]}); // 나중에 인구이동 어디해야하는지 알기위해 넣자

            for (int i = 0; i < 4; i++) {

                int R = pick[0] + dr[i];
                int C = pick[1] + dc[i];

                // 범위 벋어나지 않으면서
                if (R >= 0 && C >= 0 && R < N && C < N && !visit[R][C]) {

                    // 영역의 차이
                    int difference = Math.abs(arr[pick[0]][pick[1]] - arr[R][C]);

                    // 영역의 차이가 주어진 범위에 있다면..
                    if (difference >= min && difference <= max) {
                        q.add(new int[]{R, C});
                        visit[R][C] = true;
                    }
                }
            } // end 사방 도는 for문

        } // end while문
    } // end bfs

    // 연합된곳들 인구수 변동해주자
    // list에서 방문한곳들 찾아서 인구갱신해주자
    private static void changeMap() {
        // TODO Auto-generated method stub
        int size = list.size();

        int total = 0; // 총 인구수
        for (int i = 0; i < list.size(); i++) {
            int r = list.get(i)[0];
            int c = list.get(i)[1];

            total += arr[r][c];
        }

        //System.out.println(total);

        int newPeople = total / size;

        // 인구 갱신해주자
        for (int i = 0; i < list.size(); i++) {
            int r = list.get(i)[0];
            int c = list.get(i)[1];

            arr[r][c] = newPeople;
        }

    }
}