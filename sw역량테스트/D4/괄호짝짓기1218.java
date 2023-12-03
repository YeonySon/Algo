package sw역량테스트.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호짝짓기1218 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {

            int N = Integer.parseInt(br.readLine());

            char[] arr = new char[N];
            String line = br.readLine();
            for (int i = 0; i < N; i++)
                arr[i] = line.charAt(i);

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < N; i++) {

                if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[' || arr[i] == '<') {
                    stack.add(arr[i]);
                } else if (arr[i] == ')' || arr[i] == '}' || arr[i] == ']' || arr[i] == '>') {
                    if (stack.isEmpty() || stack.peek() == '(' && arr[i] == '}' || stack.peek() == '(' && arr[i] == ']'
                            || stack.peek() == '(' && arr[i] == '>' || stack.peek() == '{' && arr[i] == ')' || stack.peek() == '{' && arr[i] == ']'
                            || stack.peek() == '{' && arr[i] == '>' || stack.peek() == '[' && arr[i] == ')' || stack.peek() == '[' && arr[i] == '}'
                            || stack.peek() == '[' && arr[i] == '>' || stack.peek() == '<' && arr[i] == ')' || stack.peek() == '<' && arr[i] == '}'
                            || stack.peek() == '<' && arr[i] == ']') {
                        stack.add(arr[i]);
                        break;
                    } else {
                        stack.pop();
                    }
                }


            }
            if (stack.size() > 0) {
                System.out.println("#" + tc + " " + 0);
            } else {
                System.out.println("#" + tc + " " + 1);
            }
        }
    }

}

