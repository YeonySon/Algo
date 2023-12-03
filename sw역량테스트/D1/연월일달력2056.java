package sw역량테스트.D1;

import java.util.Scanner;

public class 연월일달력2056 {
    public static void main(String[] args) {

        //22220228 -> 2022/02/28 처럼 유효성 검사를 해서 출력. 만약 형식이 맞지 않으면 -1출력

        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        for (int tc = 1; tc<=T; tc++){

            String input = sc.nextLine();

            String year = input.substring(0, 4);
            int opYear = Integer.parseInt(year);
            String month = input.substring(4, 6);
            int opMonth = Integer.parseInt(month);
            String date = input.substring(6);
            int opDate = Integer.parseInt(date);

            if ((opYear > 0000 && opYear <= 9999) && (opMonth != 0 && opMonth <= 12) && (opDate != 0)) {
                if (opMonth == 1 || opMonth == 3 || opMonth == 5 || opMonth == 7 || opMonth == 8 || opMonth == 10
                        || opMonth == 12) {
                    if (opDate <= 31) {
                        System.out.println("#"+tc+ " " + year + "/" + month + "/" + date);
                    } else {
                        System.out.println("#"+tc+ " " +-1);
                    }
                } else if (opMonth == 2) {
                    if (opDate <= 28) {
                        System.out.println("#"+tc+ " " + year + "/" + month + "/" + date);
                    } else {
                        System.out.println("#"+tc+ " " +-1);
                    }
                } else if (opMonth == 4 || opMonth == 6 || opMonth == 9 || opMonth == 11) {
                    if (opDate <= 30) {
                        System.out.println("#"+tc+ " " + year + "/" + month + "/" + date);
                    } else {
                        System.out.println("#"+tc+ " " +-1);
                    }
                }
            } else {
                System.out.println("#"+tc+ " " +-1);
            }


        }

    }
}
