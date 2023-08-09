package Leetcode;

// 509. Fibonacci Number

public class FibonacciNumber {
    
        public int fib(int n) {
            return solveRecursion(n);
        }
    
        private int solveRecursion(int n){
            if(n<=1){
                return n;
            }
            return solve(n-1)+solve(n-2);
        }
    }
}
