package stack.questions;

import java.util.Stack;

public class RedundantBrackets {

    public boolean redundantBrackets(String string) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == '(' || ch == '-' || ch == '+' || ch == '*' || ch == '/') {
                stack.push(ch);
            } else {
                // Either Closing bracket or lowercase letter
                if (ch == ')') {
                    boolean isRedundant = true;
                    while (stack.peek() != '(') {
                        char top = stack.peek();
                        if (top == ')' || top == '-' || top == '+' || top == '*' || top == '/') {
                            isRedundant = false;
                        }
                        stack.pop();
                    }
                    if (isRedundant) {
                        return true;
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
}
