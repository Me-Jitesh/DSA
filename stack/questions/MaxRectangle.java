package stack.questions;

import java.util.Stack;

public class MaxRectangle {

    public int maxRectangle(int[][] matrix, int n, int m) {

        // Compute Area for first row
        int area = largestRectangleArea(matrix[0], m);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // row update : by adding previous row's value
                if (matrix[i][j] != 0) {
                    matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
            // Entire row is updated now
            area = Integer.max(area, largestRectangleArea(matrix[i], m));
        }
        return area;
    }

    public int largestRectangleArea(int[] heights, int n) {

        int[] next = new int[n];
        next = nextSmallerElement(heights, n);

        int[] prev = new int[n];
        prev = preSmallerElement(heights, n);
        int area = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int l = heights[i];

            if (next[i] == -1) {
                next[i] = n;
            }

            int b = next[i] - prev[i] - 1;

            int newArea = l * b;
            area = Integer.max(area, newArea);
        }
        return area;
    }

    private int[] preSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (stack.peek() != -1 && arr[stack.peek()] >= curr) {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (stack.peek() != -1 && arr[stack.peek()] >= curr) {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
