package sw역량테스트.D1;

import java.util.Scanner;

public class 알파벳을숫자로변환2050 {
    public static void main(String[] args) {
//아스키코드를 활용해서 즉 char를 활용햇서 변환
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char[] array1 = word.toCharArray();


        for (int i =0; i<array1.length; i++){
            System.out.print(array1[i]-'A'+1+" ");
        }




        //String[] array = word.split("");
        //String[] array1 = new String[array.length];

//        for (int i = 0; i<array.length; i++){
//            //array1[i] = (i+1)+"";
//            array[i] = array[i]-65+1+"";
//
//        }
//
//        for (int j = 0; j<array.length; j++){
//            System.out.print(array[j] + " ");
//        }

    }
}
