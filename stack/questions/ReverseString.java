package stack.questions;

import java.util.Stack;

public class ReverseString {

    public void reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String ans = "";

        while (!stack.isEmpty()) {
            ans = ans.concat(stack.peek().toString());
            stack.pop();
        }
        System.out.println("Reverse Of " + str + " is : " + ans);
    }
}
