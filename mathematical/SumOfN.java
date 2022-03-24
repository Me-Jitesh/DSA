package mathematical;

public class SumOfN {

    public void sumOfNMetod1(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum Of 1 to n is : " + sum);
    }
}
