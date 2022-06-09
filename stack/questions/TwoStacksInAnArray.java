package stack.questions;

public class TwoStacksInAnArray {
    int arr[];
    int top1;
    int top2;
    int size;

    public TwoStacksInAnArray(int size) {
        this.size = size;
        this.top1 = -1;
        this.top2 = size;
        arr = new int[size];
    }

    public void push1(int element) {
        if (top2 - top1 > 1) {
            top1++;
            arr[top1] = element;
        } else {
            System.out.println("Stack Overflow ! ");
        }
    }

    public void push2(int element) {
        if (top2 - top1 > 1) {
            top2--;
            arr[top2] = element;
        } else {
            System.out.println("Stack Overflow ! ");
        }
    }

    public void pop1() {
        if (top1 >= 0) {
            System.out.println("Popped : " + arr[top1]);
            top1--;
        } else {
            System.out.println("Stack Underflow ! ");
        }
    }

    public void pop2() {
        if (top2 < size) {
            System.out.println("Popped : " + arr[top2]);
            top2++;
        } else {
            System.out.println("Stack Underflow ! ");
        }
    }
}
