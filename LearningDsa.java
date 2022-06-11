import Implementations.QueueArray;

public class LearningDsa {

    public static void main(String[] args) {

        testQueueArray();

    }

    static void testQueueArray() {
        QueueArray queueArray = new QueueArray(5);

        queueArray.enqueue(10);
        queueArray.enqueue(20);
        queueArray.enqueue(30);
        queueArray.enqueue(40);
        queueArray.enqueue(50);
        // queueArray.enqueue(60);

        queueArray.front();
        queueArray.isEmpty();

        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.dequeue();
        queueArray.dequeue();
        // queueArray.dequeue();

        queueArray.front();
        queueArray.isEmpty();
    }
}