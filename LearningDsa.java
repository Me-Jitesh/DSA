import array.linearsearch.LinearSearch;

public class LearningDsa {

    public static void main(String[] args) {

        // Linear search In 1-D Array
        linSeaIndex1d();

    }

    static void linSeaIndex1d() {
        // int[] arr = {};
        int[] arr = { 20, 90, 50, 60, 33, 44, 34, 43, 76, 23 };

        int index = new LinearSearch().searchInOneDim(arr, 44);
        if (index == -1) {
            System.out.println("Not Available , exited with index " + index);
        } else {
            System.out.println("Find at Index : " + index);
        }
    }
}