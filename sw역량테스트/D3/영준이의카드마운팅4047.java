package sw역량테스트.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 영준이의카드마운팅4047 {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        //S D H C 순서로 각각 배열을 만들

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            int[] arrS = new int[13];
            int[] arrD = new int[13];
            int[] arrH = new int[13];
            int[] arrC = new int[13];

            String line = br.readLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'S') {
                    //만약 S뒤에 한자리숫자라면 바로다음은 버리고
                    //2번째 거를 인덱스에 -1해서 집어넣는다.
                    //십의자리라면 그것도 -1해서 집어넣는다.
                    //1의자리일경우
                    if (line.charAt(i + 1) == '0') {
                        int num = line.charAt(i + 2) - '0';
                        arrS[num - 1]++;
                    } else {
                        int num = Integer.parseInt(line.charAt(i + 1) + "" + line.charAt(i + 2));
                        arrS[num - 1]++;
                    }


                } else if (line.charAt(i) == 'D') {
                    if (line.charAt(i + 1) == '0') {
                        int num = line.charAt(i + 2) - '0';
                        arrD[num - 1]++;
                    } else {
                        int num = Integer.parseInt(line.charAt(i + 1) + "" + line.charAt(i + 2));
                        arrD[num - 1]++;
                    }

                } else if (line.charAt(i) == 'H') {
                    if (line.charAt(i + 1) == '0') {
                        int num = line.charAt(i + 2) - '0';
                        arrH[num - 1]++;
                    } else {
                        int num = Integer.parseInt(line.charAt(i + 1) + "" + line.charAt(i + 2));
                        arrH[num - 1]++;
                    }

                } else if (line.charAt(i) == 'C') {
                    if (line.charAt(i + 1) == '0') {
                        int num = line.charAt(i + 2) - '0';
                        arrC[num - 1]++;
                    } else {
                        int num = Integer.parseInt(line.charAt(i + 1) + "" + line.charAt(i + 2));
                        arrC[num - 1]++;
                    }

                }
            }
//            System.out.println(Arrays.toString(arrS));
//            System.out.println(Arrays.toString(arrD));
//            System.out.println(Arrays.toString(arrH));
//            System.out.println(Arrays.toString(arrC));
            System.out.print("#" + tc);
            int countS = 0;
            int countD = 0;
            int countH = 0;
            int countC = 0;
            boolean flag = true;
            for (int i = 0; i < 13; i++) {
                if (arrS[i] > 1 || arrD[i] > 1 || arrH[i] > 1 || arrC[i] > 1) {
                    flag = false;
                    break;
                }

                if (arrS[i] == 0)
                    countS++;
                if (arrD[i] == 0)
                    countD++;
                if (arrH[i] == 0)
                    countH++;
                if (arrC[i] == 0)
                    countC++;

            }
            if (flag == false) {
                System.out.print(" ERROR");
            } else {
                System.out.print(" " + countS + " " + countD + " " + countH + " " + countC);
            }
            System.out.println();
        }


    }
}
