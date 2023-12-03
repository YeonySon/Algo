package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //()와 []로만 stack에 넣고 pop하기

        Stack<Character> stack = new Stack<>();
        while (true) {
            //매번 새로운 라인 받을때마다 비우고 시작
            stack.clear();
            String line = br.readLine();
            //마지막에 .만 있을시 종료
            if (line.equals(".")) {
                break;
            } else {

                for (int i = 0; i < line.length(); i++) {
                    //() , [] 일때만 push pop
                    if (line.charAt(i) == '(' || line.charAt(i) == '[') {
                        stack.push(line.charAt(i));
                    } else if (line.charAt(i) == ')' || line.charAt(i) == ']') {

                        // ) 또는 ] 일때 스택이 비어있거나  가장위에가 비교랑 짝이 아닐때 push하고 break;
                        if (stack.isEmpty() || (stack.peek() == '(' && line.charAt(i) == ']') ||
                                (stack.peek() == '[' && line.charAt(i) == ')')) {
                            stack.push(line.charAt(i));
                            //짝이 안 맞기에 그냥 볼것도 없이 break;
                            break;
                        } else
                            stack.pop();
                    }
                }
                //스택이 다 비어있으면 다 pop 된거므로
                if (stack.isEmpty()) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}

