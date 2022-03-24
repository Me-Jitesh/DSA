package bitwiseoperator;

public class Fundamental {

    public void operationFor(int num1, int num2) {
        System.out.println("Bitwise and Operation is result : " + (num1 & num2));
        System.out.println("Bitwise or Operation is result : " + (num1 | num2));
        System.out.println("Bitwise xor Operation is result : " + (num1 ^ num2));
        System.out.println("Bitwise complement Operation result for " + num1 + " is : " + (~num1));
        System.out.println("Bitwise complement Operation result for " + num2 + " is : " + (~num2));
    }

    public void leftShift(int num1, int num2) {
        System.out.println("Bitwise left shift Operation result for " + num1 + "<<" + num2 + " is : " + (num1 << num2));
    }

    public void rigtShift(int num1, int num2) {
        System.out.println("Bitwise right shift Operation result for " + num1 + ">>" + num2 + " is : " + (num1 >> num2));
    }
}
