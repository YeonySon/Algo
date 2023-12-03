package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 크로아티아알파벳 {
    public static void main(String[] args) throws IOException {

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 크로아티아알파벳

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (word.contains(arr[i])){
                word=word.replace(arr[i],"@");
            }


        }
        System.out.println(word.length());

        }
    }

