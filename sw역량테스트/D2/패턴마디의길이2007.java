package sw역량테스트.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 패턴마디의길이2007 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int tc=1; tc<=t; tc++){

            String word = br.readLine();
            int count = 0;
           outer : for(int i=0; i<word.length(); i++){
                for(int j=i+1; j<word.length(); j++){

                    if (word.charAt(i) == word.charAt(j) && word.charAt(i+1)==word.charAt(j+1)){
                        count = j;
                        break outer;
                    }


                }


            }
            System.out.println("#"+tc+" "+count);


        }



    }
}
