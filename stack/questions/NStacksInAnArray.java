package stack.questions;

public class NStacksInAnArray {

    int[] arr;
    int[] top;
    int[] nxt;

    int n, s;

    int freeSpot;

    public NStacksInAnArray(int N, int S) {
        n = N;
        s = S;
        arr = new int[s];
        top = new int[n];
        nxt = new int[s];

        // top initialize
        for (int i = 0; i < n; i++) {
            top[i] = -1;
        }

        // nxt initialize
        for (int i = 0; i < s; i++) {
            nxt[i] = i + 1;
        }

        // update last index value to -1
        nxt[s - 1] = -1;

        // initialize freeSpot
        freeSpot = 0;
    }

    public boolean push(int x, int m) {

        // check overflow
        if (freeSpot == -1) {
            System.out.println("Push : " + false);
            return false;
        }

        // find index
        int index = freeSpot;

        // update freeSpot
        freeSpot = nxt[index];

        // Insert Element to array
        arr[index] = x;

        // update next
        nxt[index] = top[m - 1];

        // update top
        top[m - 1] = index;

        System.out.println("Push : " + true);
        return true;
    }

    public int pop(int m) {

        // check underflow condition
        if (top[m - 1] == -1) {
            System.out.println("underflow ! ");
            return -1;
        }

        int index = top[m - 1];

        top[m - 1] = nxt[index];

        nxt[index] = freeSpot;

        freeSpot = index;

        System.out.println("Popped : " + arr[index]);
        return arr[index];
    }
}
