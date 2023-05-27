package Mathematics;

public class Factorial {

  public static void fact(int num) {
    double res = 1;
    while (num > 1) {
      res *= num;
      num--;
    }
    System.out.println("Factorial is : " + res);
  }
}
