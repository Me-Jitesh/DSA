import array.linearsearch.LinearSearch;

public class LearningDsa {

    public static void main(String[] args) {

        // Linear search In 1-D Array ; Return Index
        // linSeaIndex1d();

        // Linear search In 1-D Array ; Return Value
        // linSeaVal1d();

        // Search Charecter In String
        // searchChar();

        // Search Charecter In String Array
        searchCharStrArr();

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

    static void linSeaVal1d() {
        // int[] arr = {};
        int[] arr = { 20, 90, 50, 60, 33, 44, 34, 43, 76, 23 };

        int val = new LinearSearch().searchValueInOneDim(arr, 33);

        System.out.println("Find Value : " + val);

    }

    static void searchChar() {
        String word = "";
        // String word = "Hello";
        char letter = 'l';
        int index = new LinearSearch().searchCharInString(word, letter);
        if (index == -1) {
            System.out.println("Not Available , exited with index " + index);
        } else {
            System.out.println("Find Character At Index " + index);
        }
    }

    static void searchCharStrArr() {
        // String word = "";
        String word = "Hello";
        char letter = 'H';
        boolean res = new LinearSearch().searchCharInStringArray(word, letter);
        if (res) {
            System.out.println("Find Character , result.... " + res);
        } else {
            System.out.println("Not Available ,  result.... " + res);
        }
    }

}