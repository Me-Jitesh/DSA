package Implementations;

public class DequeArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public DequeArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void pushFront(int data) {
        if (front == 0 && rear == size - 1 || rear == (front - 1) % (size - 1)) {
            System.out.println("pushFront : Queue is full ! ");
        } else if (front == -1) { // first element to push
            front = 0;
            rear = 0;

        } else if (front == 0 && rear != size - 1) {
            front = size - 1; // to maintain cyclic nature
        } else {
            front--;
        }

        arr[front] = data;
        System.out.println("pushFront : " + data);
    }

    public void pushRear(int data) {
        if (front == 0 && rear == size - 1 || rear == (front - 1) % (size - 1)) {
            System.out.println("pushRear : Queue is full ! ");
        } else if (front == -1) { // first element to push
            front = 0;
            rear = 0;

        } else if (rear == size - 1 && front != 0) {
            rear = 0; // to maintain cyclic nature
        } else {
            rear++;
        }

        arr[rear] = data;
        System.out.println("pushRear : " + data);

    }

    public int popFront() {
        if (front == -1) {
            System.out.println("popFront : Queue is empty ! ");
            return -1;
        }

        int ans = arr[front];
        arr[front] = -1;

        if (front == rear) { // single element present

            front = -1;
            rear = -1;

        } else if (front == (size - 1)) {
            front = 0; // to maintain cyclic nature
        } else {
            front++;
        }

        System.out.println("popFront : " + ans);
        return ans;
    }

    public int popRear() {
        if (front == -1) {
            System.out.println("popRear : Queue is empty ! ");
            return -1;
        }

        int ans = arr[rear];
        arr[rear] = -1;

        if (front == rear) { // single element present
            front = rear - 1;
        } else if (rear == 0) {
            rear = size - 1; // to maintain cyclic nature
        } else {
            rear--;
        }

        System.out.println("popRear : " + ans);
        return ans;
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("getFront : Queue is Empty ! ");
            return -1;
        }
        System.out.println("getFront : " + arr[front]);
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("getRear : Queue is Empty ! ");
            return -1;
        }
        System.out.println("getRear : " + arr[rear]);
        return arr[rear];
    }

    public boolean isEmpty() {
        if (front == -1) {
            System.out.println("isEmpty : Queue is Empty ! " + true);
            return true;
        } else {
            System.out.println("isEmpty : Queue is Empty ! " + false);
            return false;
        }
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1 || (front != 0 && rear == (front - 1) % (size - 1))) {
            System.out.println("isFull : " + true);
            return true;
        } else {
            System.out.println("isFull : " + false);
            return false;
        }
    }
}
