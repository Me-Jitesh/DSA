package stack.questions;

import java.util.Stack;

public class ValidParenthesis {
    public boolean checkValidParenthesis(String expession) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expession.length(); i++) {
            char ch = expession.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty()) {
                    char top = stack.peek();
                    if (matches(top, ch)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean matches(char top, char ch) {

        if ((ch == ')' && top == '(') ||
                (ch == '}' && top == '{') ||
                (ch == ']' && top == '[')) {
            return true;
        }
        return false;
    }
}
