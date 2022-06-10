package stack.questions;

import java.util.Stack;

public class ReverseStackUsingRecursion {

    public void reverseStackUsingRecursion(Stack<Integer> stack) {

        if (stack.empty()) {
            return;
        }

        int num = stack.peek();
        stack.pop();
        reverseStackUsingRecursion(stack);
        new InsertAtBottom().insert(stack, num);
    }
}
