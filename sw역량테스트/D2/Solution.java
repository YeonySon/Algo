package sw역량테스트.D2;

import java.util.Scanner;
import java.util.Arrays;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.s
		*/
        String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); //학생수
            int K = sc.nextInt(); //점수를 알고싶은 학생번호K
            double[] score = new double[N];
            double[] result = new double[N];


            for (int i = 0; i < N; i++) {
                int score1 = sc.nextInt(); //중간고사
                int score2 = sc.nextInt(); //기말고사
                int score3 = sc.nextInt(); //과제
                score[i] += score1 * 0.35 + score2 * 0.45 + score3 * 0.2;
            }

            double k_score = 0.0;
            k_score = score[K - 1]; //학생번호K의 점수

            Arrays.sort(score); // 점수순으로 정렬
            for (int i = 0; i < N; i++) { //내림차순으로 정렬후 저장
                result[i] = score[N - 1 - i];
            }

            for (int i = 0; i < N; i++) { //학생번호K의 점수순일때 인덱스 위치
                if (result[i] == k_score) {
                    System.out.println("#" + test_case + " " + grade[i / (N / 10)]);
                    break;
                }
            }


        }
    }
}
