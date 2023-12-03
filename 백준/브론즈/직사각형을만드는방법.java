package 백준.브론즈;

import java.util.Scanner;

public class 직사각형을만드는방법 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        for(int i=1; i<=n; i++){

            //i로 만들수 있는 행렬개수
            int r = 0;
            int c = 0;

            for(int k= (int)Math.sqrt(i); k>=1; k--){
                if(i%k==0){
                    r=k;
                    count++;
                    c=i/r;
                }
//                System.out.println(r+" "+c);
            }

        }
        System.out.println(count);

    }
}
