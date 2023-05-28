package Mathematics;

public class TrailingZerosInFactorial {

  public static void findTrailingZerosInFactorial(int num) {
    double res = 0;
    for (int i = 5; i <= num; i = i * i) {
      res = res + Math.floor(num / i);
    }
    System.out.println(" Trailing Zeroes In Factorial : " + res);
  }
}
