package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInteger {
    public ArrayList<Integer> firstNegativeInteger(int[] arr, int k) {

        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        // Process first window of k size

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                deque.add(i);
            }
        }

        // store answer of first k sized Window
        if (deque.size() > 0) {
            ans.add(arr[deque.peek()]);
        } else {
            ans.add(0);
        }

        // process for remaining window
        for (int i = k; i < arr.length; i++) {
            // removal
            if (!deque.isEmpty() && i - deque.peek() >= k) {
                deque.pollFirst();
            }

            // addition
            if (arr[i] < 0) {
                deque.addLast(i);
            }

            // ans store
            if (deque.size() > 0) {
                ans.add(arr[deque.peek()]);
            } else {
                ans.add(0);
            }
        }
        System.out.println(Arrays.toString(ans.toArray()));
        return ans;
    }
}
