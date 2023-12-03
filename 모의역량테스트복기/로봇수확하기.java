package 모의역량테스트복기;

import java.util.Scanner;

public class 로봇수확하기 {
    //로봇방향을 유지한채 그 자리가 0이면 씨앗을 심는다 
    //방향은 우 상 좌 하 순서대로 방향으로 움직인다
    //씨앗을 심으면 계속적으로 자라면서
    //4일이 지나면 씨앗 심은 땅에서 곡식을  수확을 할 수 있다
    //x일이 주어질 때 최대 수학할 수 있는 곡식의 개수는?


    static int T;
    static int N;
    static int M;
    static int[][] arr;
    static int[][] tmp; // 지도 복사
    static int[][] left = {{-1,0},{0,-1},{0,+1},{0,+1}}; // 왼쪽방향을 바라보고 있을 때 우 상 좌 하로 좌표 이동 즉 상, 왼, 하, 오
    static int[][] up = {{0,-1},{+1,0},{0,+1},{-1,0}}; // 왼 하 우 상
    static int[][] right = {{+1,0},{0,+1},{-1,0},{0,-1}}; // 하 오 상 왼
    static int[][] down = {{0,-1},{+1,0},{0,+1},{-1,0}}; // 왼 하 우 상

            /*6 11
            111111
            110001
            100001
            110001
            100001
            111111*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        T = sc.nextInt(); // 테케
        
        for(int tc=1; tc<=T; tc++){
            
            N = sc.nextInt(); // 행렬크기
            M = sc.nextInt(); // 몇일?

            arr = new int[N][N];
            
            
            
        }
    }
    
}
