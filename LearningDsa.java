import Mathematics.FastExponentiation;
import Mathematics.NumberConversion;
import Mathematics.ReverseNumber;

public class LearningDsa {

    public static void main(String[] args) {
        // Testing
        // fastExpoTest();
        // NumberConversionTest();
        reverseNumTest();
    }

    static void reverseNumTest() {
        ReverseNumber.reverseNum(123456);
    }

    static void NumberConversionTest() {
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