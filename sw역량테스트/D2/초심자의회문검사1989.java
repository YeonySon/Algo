package sw역량테스트.D2;

import java.util.Scanner;

public class 초심자의회문검사1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tc=1; tc<=t; tc++){

            String word = sc.next();

            if (word.length()%2==0) {
                for (int i = 0, j = word.length() - 1; i < word.length()/2 && j>word.length()/2-1; i++,j--) {

                    if (word.charAt(i)==word.charAt(j)){
                        System.out.println("#"+tc + " " + 1);
                        break;
                    } else {
                        System.out.println("#"+tc + " " + 0);
                        break;
                    }
                }
            }else {
                for (int i = 0, j = word.length() - 1; i < word.length()/2 && j>word.length()/2; i++,j--) {

                    if (word.charAt(i)==word.charAt(j)){
                        System.out.println("#"+tc + " " + 1);
                        break;
                    } else {
                        System.out.println("#"+tc + " " + 0);
                        break;
                    }
                }

            }


        }

    }
}
