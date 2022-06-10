package stack.questions;

import java.util.Stack;

public class SortTheStack {
    public void sortStack(Stack<Integer> stack) {
        // base case
        if (stack.empty()) {
            return;
        }

        int num = stack.peek();
        stack.pop();
        // Recursive call
        sortStack(stack);
        // insert at Stack
        sortedInsert(stack, num);
    }

    private void sortedInsert(Stack<Integer> stack, int num) {
        if (stack.empty() || (!stack.empty() && (stack.peek() < num))) {
            stack.push(num);
            return;
        }

        int n = stack.peek();
        stack.pop();
        sortedInsert(stack, num);
        stack.push(n);
    }
}
