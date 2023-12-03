package sw역량테스트.D1;

import java.util.Scanner;

public class 거꾸로출력해보아요1545 {
    public static void main(String[] args) {
        // 입력받은 수를 역순으로해서 나열하시오

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i>=0; i--){
            System.out.print(i + " ");
        }

    }
}
