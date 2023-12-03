package 백준.브론즈;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 줄세우기1681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

        int N = sc.nextInt();
        String minus = sc.next();

        List<Integer> list = new ArrayList<>();

        while (true) {

            // minus하는 숫자를 포함하고 있으면 배열에 안 집어넣기

            String str = String.valueOf(num);

            if (str.contains(minus)) {

            } else {
                list.add(num);
            }

            num++;

            if (list.size() == N)
                break;

        }

        System.out.println(list.get(N - 1));




    }
}
