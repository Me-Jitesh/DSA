import java.util.Arrays;

import array.binarysearch.onedim.AggressiveCows;
import array.binarysearch.onedim.BinarySearch;
import array.binarysearch.onedim.BookAllocation;
import array.binarysearch.onedim.FindPivot;
import array.binarysearch.onedim.FirstAndLastPositionOfElem;
import array.binarysearch.onedim.OrderAgnosticBinSearch;
import array.binarysearch.onedim.PaintersPartitionProblem;
import array.binarysearch.onedim.SearchInRotatedSortedArray;
import array.binarysearch.twodim.RowColSortedMatrix;
import array.binarysearch.twodim.SortedMatrix;
import array.linearsearch.onedim.LinearSearch;
import array.linearsearch.twodim.LinearSearch2d;
import array.operation.FindDuplicate;
import array.operation.FindIntersection;
import array.operation.FindUnique;
import array.operation.PairSum;
import array.operation.ReverseArray;
import array.operation.SortZeroOnes;
import array.operation.SwapAlternate;
import array.sorting.bubblesort.BubbleSortInc;
import array.sorting.selectionsort.SelectionSortInc;

public class LearningDsa {

    public static void main(String[] args) {

        // Binary Search in Sorted 2d Array
        // sortedMatrixBinSearch();

        // Search in Row and Column wise Sorted 2d Array
        // rowColSorted2d();

        // Binary Search In Order Agnostic Array
        // binSearchAgnos();

        // Binary Search In 1D Array Dscending Order
        // binSearchDsc();

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

        // Reverse the array
        // printReverseArray();

        // Swap alternate
        // printSwapAlternate();

        // Find Unique
        // printFindUnique();

        // prinFindDuplicate();

        // prinFindIntersection();

        // printPairSum();

        // printSortZeroOnes();

        // printFirstAndLastPositionOfElem();

        // printFindPivot();

        // printSearchInRotatedSortedArray();

        // printBookAllocation();

        // printPaintersPartitionProblem();

        // printAggressiveCows();

        // printSelectionSortInc();

        printBubbleSortInc();

    }

    static void printBubbleSortInc() {
        // int[] arr = { 4, 2, 1, 3, 6, 8, 9, 9, 23, 45 };
        // int[] arr = { 4, 2, 1, 3, 55, 6, 8, 9, 9, 23, 45, 6 };
        // int[] arr = { 1, 2, 3, 6, };
        int[] arr = { 1, 2, 3, 6,2,4 };

        // new BubbleSortInc().bubbleSortIncMethod1(arr);
        // new BubbleSortInc().bubbleSortIncMethod1Opti(arr);
        new BubbleSortInc().bubbleSortIncMethod1Opti2(arr);
    }

    static void printSelectionSortInc() {
        int[] arr = { 4, 2, 1, 3, 6 };
        new SelectionSortInc().selectionSortIncMethod1(arr);
    }

    static void printAggressiveCows() {
        // int[] stalls = { 4, 2, 1, 3, 6 };
        int[] stalls = { 1, 2, 3 };
        int cows = 2;

        new AggressiveCows().aggressiveCowsMethod1(stalls, cows);
    }

    static void printPaintersPartitionProblem() {
        int[] arr = { 5, 5, 5, 5 };
        int painters = 2;

        new PaintersPartitionProblem().paintersPartitionProblemMethod1(arr, painters);
    }

    static void printBookAllocation() {
        int[] arr = { 12, 34, 67, 90 };
        int students = 2;

        new BookAllocation().bookAllocationMethod1(arr, students);
    }

    static void printSearchInRotatedSortedArray() {
        int[] arr = { 8, 10, 17, 1, 3 };

        int target = 17;
        // int target = 89;
        new SearchInRotatedSortedArray().SearchInRotatedSortedArrayMethed1(arr, target);
    }

    static void printFindPivot() {
        int[] arr = { 3, 8, 10, 17, 1 };
        new FindPivot().findPivotMethod1(arr);
    }

    static void printFirstAndLastPositionOfElem() {
        int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 7, 8, 9, 9, 9 };
        // int target = 4;
        int target = 3;
        // int target = 9;

        new FirstAndLastPositionOfElem().firstAndLastPositionOfElemMetheod1(arr, target);
    }

    static void printSortZeroOnes() {
        int[] arr = { 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0 };

        new SortZeroOnes().sortZeroOnesMethod1(arr);
    }

    static void printPairSum() {
        int[] arr = { 1, 4, 5, 3, 2, 6 };
        // int sum = 5;
        int sum = 6;
        new PairSum().pairSumMethod1(arr, sum);

    }

    static void prinFindIntersection() {
        int[] arr1 = { 1, 4, 5 };
        int[] arr2 = { 3, 4, 5 };
        // new FindIntersection().findIntersectionMethod1(arr1, arr2);
        new FindIntersection().findIntersectionMethod1Opti(arr1, arr2);
    }

    static void prinFindDuplicate() {
        int[] arr = { 1, 2, 5, 4, 7, 3, 8, 6, 9, 4 };
        new FindDuplicate().findDuplicateMethod1(arr);
    }

    static void printFindUnique() {
        int[] arr = { 1, 2, 8, 7, 1, 7, 5, 2, 8 };
        new FindUnique().findUniqueMethod1(arr);
    }

    static void printSwapAlternate() {
        int[] arr = { 1, 2, 3, 7, 8, 9 };
        // int[] arr = { 1, 2, 3, 7, 8, 9, 10 };

        new SwapAlternate().swapAlternateMethod1(arr);
    }

    static void printReverseArray() {
        // int[] arr = { 1, 2, 3, 7, 8, 9 };
        int[] arr = { 1, 2, 3, 7, 8, 9, 10 };
        new ReverseArray().reverseArrayMethod1(arr);
    }

    static void sortedMatrixBinSearch() {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // int target = 5;
        // int target = 1;
        int target = 54;

        int index[] = new SortedMatrix().searchFor(arr, target);

        if (index[0] == -1) {
            System.out.println("Not Found and Exited With Index : " + Arrays.toString(index));
        } else {
            System.out.println("Found at Index : " + Arrays.toString(index));
        }
    }

    static void rowColSorted2d() {

        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }

        };

        // int target = 29;
        // int target = 229;
        int target = 40;

        int index[] = new RowColSortedMatrix().searchFor(arr, target);

        if (index[0] == -1) {
            System.out.println("Not Found and Exited With  Index : " + Arrays.toString(index));
        } else {
            System.out.println("Found at Index : " + Arrays.toString(index));
        }
    }

    static void binSearchAgnos() {

        // int ascArr[] = { -5, -1, 10, 20, 30, 45, 95, 99, 102, 110 };
        int dscArr[] = { 98, 80, 65, 52, 50, 43, 33, 19, -3, -10 };

        int target = -10;

        int res = new OrderAgnosticBinSearch().searchFor(dscArr, target);

        if (res == -1) {
            System.out.println("Not Found & Exited With : " + res);
        } else {
            System.out.println("Found at Index : " + res);
        }
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