package Leetcode;

import java.util.Arrays;

// 509. Fibonacci Number = 0 1 1 2 3 5 8 13

public class FibonacciNumber {
    
        public int fib(int n) {
            // return solveRecursion(n);
            int[] dp=new int[n+1];
            Arrays.fill(dp,-1);
            return solveMemoization(n, dp);
        }
    
        private int solveRecursion(int n){
            if(n<=1){
                return n;
            }
            return solve(n-1)+solve(n-2);
        }
       
        private int solveMemoization(int n,int[] dp){
            if(n<=1){
                return n;
            }
            if(dp[n] != -1){
                return dp[n];
            }
            return dp[n] = solveMemoization(n-1,dp)+solveMemoization(n-2,dp);
        }
     
        private int solveTabulation(int n){
            if(n<=1){
                return n;
            }
            
            int[] dp=new int[n+1];
            //dp[i]= ith fibonacci number
               dp[0]=0;
               dp[1]=1;
               for(int i=2; i<=n; i++){
                dp[i]=dp[i-1]+dp[i-2];
                }
            return dp[n];
        }
       
       
        private int solveTabulationOptimize(int n){
            if(n<=1){
                return n;
            }

            int prevOfprev=0;
            int prev=1;
            int res=0;

           for(int i=2; i<=n; i++){
            res=prev+prevOfprev;
            prevOfprev=prev;
            prev=res;
           }
           return res;
        }

        private int solveTabulationOptimizeStart1(int n){
            if(n<=1){
                return n;
            }

            int prevOfprev=0;
            int prev=1;
            int res=0;

           for(int i=1; i<n; i++){
            res=prev+prevOfprev;
            prevOfprev=prev;
            prev=res;
           }
           return res;
        }
    }
}
