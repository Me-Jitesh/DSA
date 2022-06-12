package questions;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public Queue<Integer> revFirstKElmQueue(Queue<Integer> queue, int k) {

        // step 1 : pop fisrt k element from queue and put into stock
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            int val = queue.remove();
            stack.push(val);
        }

        // step 2 : fetch from stack and push into queue
        while (!stack.empty()) {
            int val = stack.pop();
            queue.add(val);
        }

        // step 3 : fetch first (n-k) element from queue and push at back
        int t = queue.size() - k;

        while (t != 0) {
            int val = queue.remove();
            queue.add(val);
            t--;
        }

        System.out.println(queue);
        return queue;
    }
}
