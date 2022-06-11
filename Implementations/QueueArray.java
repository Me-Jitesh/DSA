package Implementations;

public class QueueArray {

    private int[] arr;
    private int front;
    private int rare;
    private int size;

    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rare = 0;
    }

    public void enqueue(int data) {
        if (rare == size) {
            System.out.println("Queue is full ! ");
        } else {
            arr[rare] = data;
            rare++;
            System.out.println("Enqueue : " + data);
        }
    }

    public int dequeue() {
        if (front == rare) {
            System.out.println("Queue is Empty ! ");
            return -1;
        } else {
            int ans = arr[front];

            arr[front] = -1;
            front++;
            if (front == rare) {
                front = 0;
                rare = 0;
            }
            System.out.println("Dequeue : " + ans);
            return ans;
        }
    }

    public int front() {
        if (front == rare) {
            System.out.println("Queue is Empty");
            return -1;
        }

        System.out.println("Front is : " + arr[front]);
        return arr[front];
    }

    public boolean isEmpty() {
        if (front == rare) {
            System.out.println("is Empty : " + true);
            return true;
        } else {
            System.out.println("is Empty : " + false);
            return false;
        }
    }

}
