package array.binarysearch.onedim;

//From Code Studio
public class BookAllocation {

    public void bookAllocationMethod1(int[] arr, int students) {
        int start = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int end = sum;
        int ans = -1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (isPossible(arr, students, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = start + (end - start) / 2;
        }
        System.out.println("Answer is : " + ans);
    }

    private boolean isPossible(int[] arr, int students, int mid) {

        int studentCount = 1;
        int pageSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum += arr[i];
            } else {
                studentCount++;

                if (studentCount > students || arr[i] > mid) {
                    return false;
                }
                pageSum += arr[i];
            }
        }
        return true;
    }
}
