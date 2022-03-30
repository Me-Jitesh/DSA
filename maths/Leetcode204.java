package maths;

//Sieve of Eratosthenes

public class Leetcode204 {
    
    public void countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n + 1];

        // Marking All True
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;

                // Setting false to multiple of prime
                for (int j = 2 * i; j < n; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        System.out.println("Prime Number Present is : " + count);
    }
}
