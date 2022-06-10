package stack.questions;

import java.util.Stack;

public class MinimumBracketReversal {

    public int minimumBracketReversal(String expression) {

        if (expression.length() % 2 == 1) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '{') {
                stack.push(ch);
            } else {
                if (!stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        // stack contains invalid expression
        int a = 0, b = 0;
        while (!stack.empty()) {
            if (stack.peek() == '{') {
                b++;
            } else {
                a++;
            }
            stack.pop();
        }
        int ans = (a + 1) / 2 + (b + 1) / 2;
        return ans;

    }
}
