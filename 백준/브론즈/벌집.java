package 백준.브론즈;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {

        // 1 3 11 25 45 71 .... 이렇게 각 벌집이 시작하는 부분찾았고
        // 각각 숫자의 차이가 6씩 등차수열이루고 있음

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
//
//        int count = 0;
//        int firstNum = 0;
//        int i = 1;
//
//        while (true){
//            firstNum= 3 * (int) Math.pow(i, 2) -(8*i) + 6;
//            if(firstNum<=num){
//                i++;
//                count++;
//            } else
//                break;
//        }
//
//
//
//
//        System.out.println(count);
        int count = 1; // 겹 수(최소 루트)
        int range = 2;	// 범위 (최솟값 기준)

        if (num == 1) {
            System.out.print(1);
        }

        else {
            while (range <= num) {	// 범위가 N보다 커지기 직전까지 반복
                range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화
                count++;	// count 1 증가
            }
            System.out.print(count);
        }


    }
}
