package array.operation;

//From Code Studio

public class FindDuplicate {

    public void findDuplicateMethod1(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ i;
        }

        System.out.println("Duplicate Element is : " + ans);
    }

}
