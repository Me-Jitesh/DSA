package stack;

public class StackArray {
    public int arr[];
    public int top;
    public int size;

    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (size - top > 1) {
            top++;
            arr[top] = element;
        } else {
            System.out.println("Stack Overflow !  ");
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
        } else {
            System.out.println("Stack Underflow ! ");
        }

    }

    public int peek() {
        if (top >= 0) {
            return arr[top];
        } else {
            System.out.println("Stack is Empty ! ");
            return -1;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
}
