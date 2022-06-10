import stack.StackArray;
import stack.questions.ReverseString;
import stack.questions.TwoStacksInAnArray;

public class LearningDsa {

    public static void main(String[] args) {
        // createStack();
        // printTwoStacksInAnArray();
        printReverseString();
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