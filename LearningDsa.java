import array.mainmethodhelper.MainMethodHelper;
import array.sorting.insertionsort.InsertionSortInc;

public class LearningDsa extends MainMethodHelper {

    public static void main(String[] args) {

        // mainMethodHelper();

        printInsertionSortInc();

    }

    protected static void printInsertionSortInc() {
        int[] arr = { 1, 2, 3, 6, 2, 4, 3, 78, 99, 12 };
        new InsertionSortInc().insertionSortIncMethod1(arr);
    }

    protected static void mainMethodHelper() {
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

        // printBubbleSortInc();
    }

}