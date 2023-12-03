package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 브론즈10992 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){


            for(int k=n-i; k>0; k--){
                System.out.print(" ");
            }

            for(int j=0; j<2*i+1; j++){

                if (i>=1)
                for(int k=1; k<2*i-1; k++ ){
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }


    }
}
