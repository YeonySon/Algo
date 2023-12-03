package sw역량테스트.D4;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기자르기5423 {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            String line = sc.next();
            Stack<Character> stack = new Stack<>();

            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(') {
                    stack.push(line.charAt(i));
                } else if (line.charAt(i) == ')' && line.charAt(i-1)=='(') {
                    stack.pop();
                    sum += stack.size();
                } else {
                    stack.pop();
                    sum += 1;
                }
            }
            System.out.println("#" + tc + " " + sum);
        }
    }
}
