import stack.StackArray;

public class LearningDsa {

    public static void main(String[] args) {
        createStack();
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