import Mathematics.ArmstrongNumber;
import Mathematics.CountDigits;
import Mathematics.EfficientEuclideanGcd;
import Mathematics.EuclideanGcd;
import Mathematics.FastExponentiation;
import Mathematics.FastExponentiationWithLimit;
import Mathematics.GreatestCommonDivisor;
import Mathematics.Lcm;
import Mathematics.NewtonRaphsonSqrRoot;
import Mathematics.NumberConversion;
import Mathematics.PrimeNumber;
import Mathematics.PrintAllDivisors;
import Mathematics.ReverseNumber;
import Mathematics.SieveOfEratosthenes;

public class LearningDsa {

  public static void main(String[] args) {
    // fastExpoTest();
    // numberConversionTest();
    // reverseNumTest();
    // countDigitsTest();
    // armstrongNumberTest();
    // primeNumbersTest();
    // sieveOfEratosthenesTest();
    // newtonRaphsonSqrRootTest();
    // printAllDivisorsTest();
    // greatestCommonDivisorTest();
    // euclideanGcdTest();
    // efficientEuclideanGcdTest();
    // lcmTest();
    fastExponentiationWithLimitTest();
  }

  static void fastExponentiationWithLimitTest() {
    FastExponentiationWithLimit.fastExponentiationWithLimit(2, 1000000000, 100);
  }

  static void lcmTest() {
    Lcm.findLcm(45, 90);
  }

  static void efficientEuclideanGcdTest() {
    EfficientEuclideanGcd.efficientEuclideanGcd(45, 90);
  }

  static void euclideanGcdTest() {
    EuclideanGcd.euclideanGcd(45, 90);
  }

  static void greatestCommonDivisorTest() {
    GreatestCommonDivisor.GCD(45, 90);
  }

  static void printAllDivisorsTest() {
    PrintAllDivisors.printAllDivisors(10);
  }

  static void newtonRaphsonSqrRootTest() {
    NewtonRaphsonSqrRoot.newtonRaphsonSqRoot(36);
  }

  static void sieveOfEratosthenesTest() {
    SieveOfEratosthenes.sieveAlgorithm(40);
  }

  static void primeNumbersTest() {
    PrimeNumber.primeNumbers(45);
  }

  static void armstrongNumberTest() {
    ArmstrongNumber.armstrongNumber(153);
  }

  static void countDigitsTest() {
    CountDigits.countDigitsByUsingLog(123456987);
  }

  static void reverseNumTest() {
    ReverseNumber.reverseNum(123456);
  }

  static void numberConversionTest() {
    NumberConversion.decimalToAnyBase(5, 2);
    NumberConversion.decimalToAnyBase(5, 4);
    NumberConversion.decimalToAnyBase(5, 8);
    NumberConversion.decimalToAnyBase(5, 16);

    NumberConversion.anyBaseToDecimal(101, 2);
    NumberConversion.anyBaseToDecimal(5, 8);
  }

  static void fastExpoTest() {
    FastExponentiation.fastExpo(2, 7);
    FastExponentiation.fastExpo(2, 4);
  }
}
