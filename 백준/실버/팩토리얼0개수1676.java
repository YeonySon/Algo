package 백준.실버;

import java.util.Scanner;

public class 팩토리얼0개수1676 {

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        //팩토리얼을 다 할 까 생가하였는데 그러지 말고
        //결국 중요한건 0의 개수이므로 0은 2 와 5가 만나야 생기므로
        // 2의 배수 5의배수 그리고 10배수를 빼주면 된다

        int num = sc.nextInt();

        int count2=0;
        int count5=0;

        for(int i=1; i<=num; i++){
            if(i%2==0){
                int number = i;
                while (number%2==0){
                    number/=2;
                    count2++;
                }
            }

            if (i%5==0) {
                int number = i;
                while (number%5==0){
                    number/=5;
                    count5++;
                }
            }
        }

        int min = Math.min(count2,count5);
        System.out.println(min);

    }

}
