package Mathematics;

public class FastExponentiationWithLimit {

  public static void fastExponentiationWithLimit(
    long num,
    long power,
    long limit
  ) {
    double res = 1;
    while (power > 0) {
      if (power % 2 != 0) {
        res = (res * (num % limit)) % limit;
        //                res = res*num;
      }
      power /= 2;
      num = ((num % limit) * (num % limit)) % limit;
      //            num = num*num;
    }

    System.out.println("Fast Exponentiation With Limit : " + res);
  }
}
