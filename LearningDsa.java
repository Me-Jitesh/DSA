import java.util.Stack;

import stack.StackArray;
import stack.questions.DeleteMiddleElement;
import stack.questions.InsertAtBottom;
import stack.questions.MinimumBracketReversal;
import stack.questions.RedundantBrackets;
import stack.questions.ReverseStackUsingRecursion;
import stack.questions.ReverseString;
import stack.questions.SortTheStack;
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
        // printReverseStackUsingRecursion();
        // printSortTheStack();
        // printRedundantBrackets();
        printMinimumBracketReversal();
    }

    static void printMinimumBracketReversal() {
        String exp = "{{}}{}{{";

        int res = new MinimumBracketReversal().minimumBracketReversal(exp);
        if (res >= 0) {
            System.out.println("Minimum Bracket To Reverse " + res);
        } else {
            System.out.println("Brackets Odd Hai" + res);
        }
    }

    static void printRedundantBrackets() {
        // String exp = "((a*b))";
        // String exp = "(a*b)";
        String exp = "(ab)";

        boolean res = new RedundantBrackets().redundantBrackets(exp);
        if (res) {
            System.out.println("Ha Redundant Hai !");
        } else {
            System.out.println("Nahi Redundant Nahi Hai !");
        }
    }

    static void printSortTheStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(2);
        stack.push(03);
        stack.push(40);
        stack.push(15);

        new SortTheStack().sortStack(stack);
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