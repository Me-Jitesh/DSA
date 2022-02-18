import java.util.Arrays;

import array.binarysearch.onedim.BinarySearch;
import array.linearsearch.onedim.LinearSearch;
import array.linearsearch.twodim.LinearSearch2d;

public class LearningDsa {

    public static void main(String[] args) {

        // Binary Search In 1D Array Dscending Order
        binSearchDsc();

        // Binary Search In 1D Array Ascending Order
        // binSearchAsc();

        // Linear search In 1-D Array ; Return Index
        // linSeaIndex1d();

        // Linear search In 1-D Array ; Return Value
        // linSeaVal1d();

        // Search Charecter In String
        // searchChar();

        // Search Charecter In String Array
        // searchCharStrArr();

        // Find Max Value In 1-D Array ; Return Value
        // findMaxVal1d();

        // Linear search In 2-D Array ; Return Index
        // linSeaIndex2d();

        // Find Max Value In 2-D Array ; Return Value
        // findingMaxVal2d();

    }

    static void binSearchDsc() {
        int arr[] = { 98, 80, 65, 52, 50, 43, 33, 19, -3, -10 };
        int target = 33;

        int res = new BinarySearch().searchInOneDimDsc(arr, target);

        if (res == -1) {
            System.out.println("Not Found & Exited With : " + res);
        } else {
            System.out.println("Found at Index : " + res);
        }
    }

    static void binSearchAsc() {
        int arr[] = { -5, -1, 10, 20, 30, 45, 95, 99, 102, 110 };
        int target = 99;

        int res = new BinarySearch().searchInOneDimAsc(arr, target);

        if (res == -1) {
            System.out.println("Not Found & Exited With : " + res);
        } else {
            System.out.println("Found at Index : " + res);
        }
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

    static void findMaxVal1d() {
        int[] arr = { 20, 90, 50, 60, 33, 44, 34, 43, 76, 0 };

        int val = new LinearSearch().findMaxVal(arr);

        System.out.println("Max Value : " + val);

    }

    static void linSeaIndex2d() {

        int arr[][] = {
                {
                        25, 552, 585, 89, 2
                },
                {
                        554, 825, 2
                },
                {
                        6, 8
                }
        };

        int ans[] = new LinearSearch2d().searchInTwoDim(arr, 2);

        System.out.println("Find at Index : " + Arrays.toString(ans));
    }

    static void findingMaxVal2d() {

        int arr[][] = {
                {
                        25, 552, 585, 89, 2
                },
                {
                        554, 225, 2
                },
                {
                        6, 8
                }
        };

        int ans = new LinearSearch2d().findMaxVal2d(arr);

        System.out.println("Maximum Value Is  : " + ans);
    }

}