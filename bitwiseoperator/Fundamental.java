package bitwiseoperator;

public class Fundamental {

    public void operationFor(int num1, int num2) {
        System.out.println("Bitwise and Operation is result : " + (num1 & num2));
        System.out.println("Bitwise or Operation is result : " + (num1 | num2));
        System.out.println("Bitwise xor Operation is result : " + (num1 ^ num2));
        System.out.println("Bitwise complement Operation result for " + num1 + " is : " + (~num1));
        System.out.println("Bitwise complement Operation result for " + num2 + " is : " + (~num2));
    }
}
