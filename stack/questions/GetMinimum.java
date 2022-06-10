package stack.questions;

import java.util.Stack;

public class GetMinimum {

    Stack<Integer> stack = new Stack<>();
    int mini;

    public void push(int data) {

        if (stack.empty()) {
            System.out.println("Pushed : " + data);
            stack.push(data);
            mini = data;
        } else {
            if (data < mini) {
                int val = 2 * data - mini;
                System.out.println("Pushed : " + val);
                stack.push(val);
                mini = data;
            } else {
                System.out.println("Pushed : " + data);
                stack.push(data);
            }
        }
    }

    public int pop() {

        if (stack.empty()) {
            System.out.println("Underflow ! ");
            return -1;
        }

        int curr = stack.pop();
        if (curr > mini) {
            System.out.println("Popped : " + curr);
            return curr;
        } else {
            int prevMini = mini;
            int val = 2 * mini - curr;
            mini = val;
            System.out.println("Popped : " + prevMini);
            return prevMini;
        }
    }

    public int top() {

        if (stack.empty()) {
            System.out.println("UnderFlow !");
            return -1;
        }

        int curr = stack.peek();
        if (curr < mini) {
            System.out.println("Top : " + mini);
            return mini;
        } else {
            System.out.println("Top : " + curr);
            return curr;
        }
    }

    public boolean isEmpty() {

        System.out.println("isEmpty : " + stack.empty());
        return stack.empty();
    }

    public int getMini() {

        if (stack.empty()) {
            System.out.println("GetMini : oops ! Empty");
            return -1;
        }

        System.out.println("Minimum Value is : " + mini);
        return mini;
    }
}
