import Implementations.CircularQueueArray;
import Implementations.QueueArray;

public class LearningDsa {

    public static void main(String[] args) {

        // testQueueArray();
        testCircularQueueArray();

    }

    static void testCircularQueueArray() {
        CircularQueueArray circularQueueArray = new CircularQueueArray(5);

        circularQueueArray.enqueue(10);
        circularQueueArray.enqueue(20);
        // circularQueueArray.enqueue(30);
        circularQueueArray.enqueue(40);
        circularQueueArray.enqueue(50);
        // circularQueueArray.enqueue(60);

        circularQueueArray.dequeue();
        circularQueueArray.dequeue();
        circularQueueArray.dequeue();
        circularQueueArray.dequeue();
        circularQueueArray.dequeue();
        // circularQueueArray.dequeue();
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