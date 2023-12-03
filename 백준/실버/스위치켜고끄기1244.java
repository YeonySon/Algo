package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 스위치켜고끄기1244 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int stuNum = Integer.parseInt(br.readLine()); // 학생수

        for (int i = 0; i < stuNum; i++) {

            String line2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(line2);

            int gender = Integer.parseInt(st2.nextToken());
            int number = Integer.parseInt(st2.nextToken());

            //남자
            if (gender == 1) {
                for (int k = number-1; k < N; k+=number) {
                        arr[k] = (arr[k] + 1) % 2;

                }
            } else {
                //여자
                int count = 0;//나중에 한번만 바꿔주기위해서
                for (int k = number - 2, j = number; k>=0&&j<N; k--, j++) {
                    if (arr[k] == arr[j]) {
                        arr[k] = (arr[k] + 1) % 2;
                        arr[j] = (arr[j] + 1) % 2;

                    }else
                        break;
                }

                //여자일때 지정된 인덱스만 한번만 바꾸기 위해서
                   arr[number-1] ^= 1;//비트마스크
                           
                

            }
//            System.out.println(Arrays.toString(arr));
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
            if((i+1)%20 == 0)
                System.out.println();
        }

    }
}
