import Mathematics.FastExponentiation;
import Mathematics.NumberConversion;

public class LearningDsa {

    public static void main(String[] args) {
        // Testing
        // fastExpoTest();
        NumberConversionTest();
    }

    private static void fastExpoTest() {
        FastExponentiation.fastExpo(2, 7);
        FastExponentiation.fastExpo(2, 4);
    }

    private static void NumberConversionTest() {
        NumberConversion.decimalToAnyBase(5, 2);
        NumberConversion.decimalToAnyBase(5, 4);
        NumberConversion.decimalToAnyBase(5, 8);
        NumberConversion.decimalToAnyBase(5, 16);

        NumberConversion.anyBaseToDecimal(101, 2);
        NumberConversion.anyBaseToDecimal(5, 8);
    }
}