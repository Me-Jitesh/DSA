package stack.questions;

import java.util.Stack;

public class InsertAtBottom {

    public void insert(Stack<Integer> stack, int data) {

        System.out.println("Stack Size : " + stack.size());

        solve(stack, data);

        System.out.println("New Stack Size : " + stack.size());
    }

    private void solve(Stack<Integer> stack, int data) {
        // base case
        if (stack.empty()) {
            stack.push(data);
            return;
        }

        int num = stack.peek();
        stack.pop();
        // Recursive call
        solve(stack, data);
        // Restore Stack
        stack.push(num);
    }
}
