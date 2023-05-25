package Mathematics;

public class EfficientEuclideanGcd {

  public static int efficientEuclideanGcd(int num1, int num2) {
    while (num1 != 0 && num2 != 0) {
      if (num1 > num2) {
        num1 %= num2;
      } else {
        num2 %= num1;
      }
    }
    int res = num1;
    if (num1 == 0) {
      res = num2;
    }
    // System.out.println("GCD is " + res);
    return res;
  }
}
