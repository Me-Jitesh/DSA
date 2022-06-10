package stack.questions;

import java.util.Stack;

public class DeleteMiddleElement {

    public void delMidElm(Stack<Integer> stack, int size) {
        System.out.println("Stack Size : " + stack.size());

        int count = 0;
        solve(stack, size, count);
        System.out.println("New Stack Size : " + stack.size());
    }

    private void solve(Stack<Integer> stack, int size, int count) {
        // base case
        if (count == size / 2) {
            stack.pop();
            return;
        }

        int num = stack.peek();
        stack.pop();
        // Recursive call
        solve(stack, size, count + 1);
        // Restore Stack
        stack.push(num);
    }
}
