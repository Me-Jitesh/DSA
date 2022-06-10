import java.util.Stack;

import stack.StackArray;
import stack.questions.DeleteMiddleElement;
import stack.questions.InsertAtBottom;
import stack.questions.ReverseStackUsingRecursion;
import stack.questions.ReverseString;
import stack.questions.TwoStacksInAnArray;
import stack.questions.ValidParenthesis;

public class LearningDsa {

    public static void main(String[] args) {
        // createStack();
        // printTwoStacksInAnArray();
        // printReverseString();
        // printDeleteMiddleElement();
        // printValidParenthesis();
        // printInsertAtBottom();
        printReverseStackUsingRecursion();
    }

    static void printReverseStackUsingRecursion() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        new ReverseStackUsingRecursion().reverseStackUsingRecursion(stack);
    }

    static void printInsertAtBottom() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        new InsertAtBottom().insert(stack, 6);
    }

    static void printValidParenthesis() {

        String expession = "{([]()}";
        boolean res = new ValidParenthesis().checkValidParenthesis(expession);
        if (res) {
            System.out.println("parethesis is Valid");
        } else {
            System.out.println("parethesis is Not Valid");
        }
    }

    static void printDeleteMiddleElement() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        new DeleteMiddleElement().delMidElm(stack, stack.size());
    }

    static void printReverseString() {
        String str = "Bonee";
        new ReverseString().reverseStringUsingStack(str);
    }

    static void printTwoStacksInAnArray() {
        TwoStacksInAnArray st = new TwoStacksInAnArray(5);
        st.push1(1);
        st.push1(2);
        // st.push1(3);
        st.push2(4);
        st.push2(5);
        st.push2(6);

        st.pop1();
        st.pop2();
        st.pop2();
        st.pop2();
        // st.pop2();
    }

    static void createStack() {
        StackArray stack = new StackArray(5);
        stack.push(10);
        // stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        // stack.push(60);

        stack.pop();

        System.out.println("Peek is : " + stack.peek());

        System.out.println("is Stack Empty : " + stack.isEmpty());

    }
}