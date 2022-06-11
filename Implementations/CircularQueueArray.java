package Implementations;

public class CircularQueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public CircularQueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (front == 0 && rear == size - 1 || rear == (front - 1) % (size - 1)) {
            System.out.println("enqueue : Queue is full ! ");
        } else if (front == -1) { // first element to push
            front = 0;
            rear = 0;
            arr[rear] = data;
            System.out.println("enqueue : " + data);

        } else if (rear == size - 1 && front != 0) {
            rear = 0; // to maintain cyclic nature
            arr[rear] = data;
            System.out.println("enqueue : " + data);
        } else {
            rear++;
            arr[rear] = data;
            System.out.println("enqueue : " + data);
        }
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("dequeue : Queue is empty ! ");
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

        System.out.println("dequeue : " + ans);
        return ans;
    }
}
