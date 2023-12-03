package 백준.실버;

import java.util.Scanner;

public class 모듈려4375 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      while (sc.hasNextInt()){

          int N = sc.nextInt();

          int num = 1;
          int res = 1;

          if(N==1){
              System.out.println(1);
              continue;
          }

          while (true){

              num++;
              res = (res*10)%N + 1;

              if(res%N == 0){

                  System.out.println(num);
                  break;
              }


          }



      }



    }
}
