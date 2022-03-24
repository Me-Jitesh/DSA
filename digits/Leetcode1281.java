package digits;

public class Leetcode1281 {

    public void subtractProductAndSum(int num) {

        int sum = 0;
        int product = 1;
        while (num != 0) {

            // Method to get last digit
            int lastDigit = num % 10;

            // find sum and prod
            sum = sum + lastDigit;
            product = product * lastDigit;

            // remove last digit
            num = num / 10;
        }

        // Subtraction of Prod-Sum
        int res = product - sum;

        System.out.println("sum is : " + sum);
        System.out.println("product is : " + product);
        System.out.println("product - sum is : " + res);
    }
}
