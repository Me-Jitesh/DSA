package questions;

import java.util.Queue;
import java.util.Stack;

public class QueueRevarsal {

    public Queue<Integer> revApproach1(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue.toString());

        return queue;
    }
}
