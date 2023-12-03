package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 조교의성적매기기1983 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tc=1; tc<=t; tc++){
            StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
            String[] arr = new String[Integer.parseInt(st1.nextToken())];
            int index = Integer.parseInt(st1.nextToken());//번째 학생수
            String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};

            for (int i=0; i<arr.length; i++){
                arr[i] = br.readLine();
                StringTokenizer st = new StringTokenizer(arr[i]," ");

                int midterm = 0;
                int last = 0;
                int subject = 0;

                midterm = Integer.parseInt(st.nextToken());
                last = Integer.parseInt(st.nextToken());
                subject = Integer.parseInt(st.nextToken());


                double score = (midterm*0.35) + (last*0.45) + (subject*0.2);





            }




        }

    }
}
