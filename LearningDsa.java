import BitManipulation.CheckSetBit;
import BitManipulation.PrintBits;
import BitManipulation.PrintOddEven;
import Graph.GraphUndirected;
import Mathematics.*;

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
        // fastExponentiationWithLimitTest();
        // factorialTest();
        // findTrailingZerosInFactorialTest();
        // printBitsTest();
        // printOddEvenTest();
        //    checkSetBitTest();
        graphUndirected();
    }

    static void graphUndirected() {
        int vertices = 9;
        int[][] arr = {{0, 1}, {0, 2}, {0, 3}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {2, 6}, {3, 4}, {7, 8}, {8, 8}}; // no of edges 11 = arr.length

        GraphUndirected graph = new GraphUndirected();
        int[][] adjMatrix = graph.adjMatrix(vertices, arr);

        System.out.println("******** Print Using DFS ********");
        graph.dfs(adjMatrix);

        System.out.println("******** Print Using BFS ********");
        graph.bfs(adjMatrix);
    }

    static void checkSetBitTest() {
        CheckSetBit.isBitSet(15, 0);
    }

    static void printOddEvenTest() {
        PrintOddEven.printOddEven(5);
        PrintOddEven.printOddEven(4);
    }

    static void printBitsTest() {
        PrintBits.printBits(5);
    }

    static void findTrailingZerosInFactorialTest() {
        TrailingZerosInFactorial.findTrailingZerosInFactorial(5);
    }

    static void factorialTest() {
        Factorial.fact(5);
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
