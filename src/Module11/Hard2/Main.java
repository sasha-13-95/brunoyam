package Module11.Hard2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скобочную последовательность");
        String string = scanner.nextLine();
        char[] brackets = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean result = false;
        for (char bracket : brackets) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                char bracket1 = stack.pop();
                if (bracket1 == '(' && bracket == ')' || bracket1 == '[' && bracket == ']' || bracket1 == '{' && bracket == '}') {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}


