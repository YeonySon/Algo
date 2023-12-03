package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        //공백을 만나기전까지는 stack에집어넣고 만나면
        //pop출력
        //< 만나면 flag하나만들어서 트루 출력
        //>만나면 false하고 그거 하나만 출력

        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '<') {
                flag = true;
                
                //<들어오기전에 stack에 있으면 다 출력
                while (!stack.isEmpty()) {
//                    System.out.print(stack.pop());
                    sb.append(stack.pop());
                }
                //< 출력
//                System.out.print(word.charAt(i));
                sb.append(word.charAt(i));


            } else if (word.charAt(i) == '>') {
                flag = false;
//                System.out.print(word.charAt(i));
                sb.append(word.charAt(i));
            } else if (flag) {
                //< 포함해서 >만나기전까지 true 이므로 그거 그대로 출력
//                System.out.print(word.charAt(i));
                sb.append(word.charAt(i));
            } else if (!flag) { // flag는 초기값이 false이므로 true로 치환해야 작동함

                if (word.charAt(i) == ' ') {

                    while (!stack.isEmpty()) {
//                        System.out.print(stack.pop());
                        sb.append(stack.pop());
                    }

//                    System.out.print(word.charAt(i));
                    sb.append(word.charAt(i));

                } else {
                    stack.push(word.charAt(i));
                }

            }
        }
        while (!stack.isEmpty()) {
//            System.out.print(stack.pop());
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
