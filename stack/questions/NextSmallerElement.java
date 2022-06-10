package stack.questions;

import java.util.Stack;

public class NextSmallerElement {

    public int[] nextSmallerElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] ans = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            while (stack.peek() >= curr) {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(curr);
        }
        return ans;
    }
}
