package 알고리즘과목평가;

import java.util.Arrays;
import java.util.Scanner;

public class 마법사의장난 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){

            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            
            //배열 넣어주기
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            
            int rep = sc.nextInt(); // 마법횟수
            
            for(int i=0; i<rep; i++) {

                int R = sc.nextInt();//행
                int C = sc.nextInt();//열
                int range = sc.nextInt();//범위
                int magicNum = sc.nextInt();//마술종류


                if (magicNum == 0) {
                    //백마법 상하좌우 범위만큼
                    int[] dr = {-1, +1, 0, 0};
                    int[] dc = {0, 0, -1, +1};
                    
                    //처음주어진 행렬은 0일때
                    //0이 아닐때 나누어서 처리
                    if(arr[R][C]==0){
                        arr[R][C]=1;
                    } else{
                        arr[R][C]*=2;
                    }

                    //범위만큼 델타이용
                    for (int j = 1; j <= range; j++) {

                        for(int k=0; k<4; k++) {
                            //범위반복문만큼 주어진 범위에서 움직이기
                            int delR = R + dr[k] * j;
                            int delC = C + dc[k] * j;
                            //주어진 행렬 밖으로 나가지말때
                            if (delR > -1 && delC > -1 && delC < N && delR < N) {
                                if (arr[delR][delC] == 0) {
                                    arr[delR][delC] = 1;
                                } else {
                                    arr[delR][delC] *= 2;
                                }
                            }
                        }

                    }


                } else if (magicNum == 1) {
                    //흑마법 대각선오 왼 상하 범위만큼
                    //에너지 절반으로감소
                    int[] dr = {-1, +1, -1, +1};
                    int[] dc = {-1, -1, +1, +1};

                    //처음주어진 행렬은 에너지 절반으로감소
                    arr[R][C] /= 2;

                    //범위만큼 델타이용
                    for (int j = 1; j <= range; j++) {

                        for(int k=0; k<4; k++) {
                            //범위반복문만큼 주어진 범위에서 움직이기
                            int delR = R + dr[k] * j;
                            int delC = C + dc[k] * j;
                            //주어진 행렬 밖으로 나가지말때
                            if (delR > -1 && delC > -1 && delC < N && delR < N) {
                                arr[delR][delC] /= 2;
                            }
                        }

                    }


                } else if (magicNum == 2) {
                    //잿빛마법


                }

            }

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }


        }




    }
}
