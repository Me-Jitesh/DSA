package BitManipulation;

public class PrintOddEven {

  public static void printOddEven(int num) {
    if ((num & 1) == 1) {
      System.out.println(num + " is ODD");
    } else {
      System.out.println(num + " is EVEN");
    }
  }
}
