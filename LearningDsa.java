import bitwiseoperator.Fundamental;

public class LearningDsa {

    public static void main(String[] args) {
        // 2 same number always give itself for and,or whereas 0 for xor
        // new Fundamental().operationFor(7, 7);

        // new Fundamental().operationFor(121, 111);

        // Complement is always -(num+1) for positive int And +(num-1) for negative And
        // 0 always -1
        // new Fundamental().operationFor(121, -121);

        new Fundamental().leftShift(100, 3); // large number left shift can be convert into negative

    }
}