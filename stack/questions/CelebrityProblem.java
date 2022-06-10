package stack.questions;

import java.util.Stack;

public class CelebrityProblem {

    public int celebrityProblem(int[][] matrix, int n) {

        Stack<Integer> stack = new Stack<>();

        // step1 : push all element in stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // step2 : get 2 element and compare
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            if (knows(matrix, a, b)) {
                stack.push(b);
            } else {
                stack.push(a);
            }
        }

        int candidate = stack.peek();

        // Step3 : Single Element in stack is potential celebrity , so varify it
        boolean rowCheck = false;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[candidate][i] == 0) {
                zeroCount++;
            }
        }

        // all zeroes
        if (zeroCount == n) {
            rowCheck = true;
        }

        // Column Check
        boolean colCheck = false;
        int oneCount = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][candidate] == 1) {
                oneCount++;
            }
        }

        // all 1 except diagonal element
        if (oneCount == n - 1) {
            colCheck = true;
        }

        if (rowCheck == true && colCheck == true) {
            return candidate;
        } else {
            return -1;
        }
    }

    private boolean knows(int[][] matrix, int a, int b) {
        if (matrix[a][b] == 1) {
            return true;
        } else {
            return false;
        }
    }
}
