package usecase;

public class FindEvenOdd {

    public void findEvenOddFor(int num) {

        boolean isEven = (num & 1) == 0;
        if (isEven) {
            System.out.println("Yess !! It is Even ");
        } else {
            System.err.println("It is Odd");
        }
    }
}
