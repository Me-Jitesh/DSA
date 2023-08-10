package Leetcode;

// 70. Climbing Stairs

public class ClimbingStairs {

  public int climbStairs(int n) {
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    return solveMemoi(n, dp);
  }

  private int solveRecursion(int n) {
    if (n < 0) {
      return 0;
    }

    if (n == 0) {
      return 1;
    }

    int oneStep = solveRecursion(n - 1);
    int twoStep = solveRecursion(n - 2);

    return oneStep + twoStep;
  }

  private int solveMemoi(int n, int[] dp) {
    if (n < 0) {
      return 0;
    }

    if (dp[n] != -1) {
      return dp[n];
    }

    if (n == 0) {
      return 1;
    }

    int oneStep = solveMemoi(n - 1, dp);
    int twoStep = solveMemoi(n - 2, dp);

    return dp[n] = oneStep + twoStep;
  }

  private int solveBottomUp(int n) {
    if (n == 1) {
      return 1;
    }

    int[] dp = new int[n + 1];

    dp[0] = 1;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }

  private int solveBottomUpConstantSpace(int n) {
    if (n == 1) {
      return 1;
    }

    int prevOfprev = 1;
    int prev = 1;
    int res = 0;

    for (int i = 2; i <= n; i++) {
      res = prevOfprev + prev;
      prevOfprev = prev;
      prev = res;
    }

    return res;
  }
  
}
