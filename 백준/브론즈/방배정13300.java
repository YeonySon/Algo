package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 방배정13300 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int stuNum = Integer.parseInt(st2.nextToken()); //학생수
        int maxRoom = Integer.parseInt(st2.nextToken()); //최대방인원수

        //각 학년별 여자0 남자1 카운트
        int[] count1 = new int[2];
        int[] count2 = new int[2];
        int[] count3 = new int[2];
        int[] count4 = new int[2];
        int[] count5 = new int[2];
        int[] count6 = new int[2];

        int totalRoom = 0;

        for (int i = 0; i < stuNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken()); // 성별
            int grade = Integer.parseInt(st.nextToken()); // 학년


            switch (grade) {
                case 1:
                    count1[gender]++;
                    break;
                case 2:
                    count2[gender]++;
                    break;
                case 3:
                    count3[gender]++;
                    break;
                case 4:
                    count4[gender]++;
                    break;
                case 5:
                    count5[gender]++;
                    break;
                case 6:
                    count6[gender]++;
                    break;
            }

        }
        for(int k=0; k<2; k++){

            if (count1[k]%maxRoom==0){
                totalRoom += count1[k]/maxRoom;
            } else{
                totalRoom += (count1[k]/maxRoom)+1;
            }
            if (count2[k]%maxRoom==0){
                totalRoom += count2[k]/maxRoom;
            } else{
                totalRoom += (count2[k]/maxRoom)+1;
            }
            if (count3[k]%maxRoom==0){
                totalRoom += count3[k]/maxRoom;
            } else{
                totalRoom += (count3[k]/maxRoom)+1;
            }
            if (count4[k]%maxRoom==0){
                totalRoom += count4[k]/maxRoom;
            } else{
                totalRoom += (count4[k]/maxRoom)+1;
            }
            if (count5[k]%maxRoom==0){
                totalRoom += count5[k]/maxRoom;
            } else{
                totalRoom += (count5[k]/maxRoom)+1;
            }
            if (count6[k]%maxRoom==0){
                totalRoom += count6[k]/maxRoom;
            } else{
                totalRoom += (count6[k]/maxRoom)+1;
            }
        }
        System.out.println(totalRoom);
    }
}
