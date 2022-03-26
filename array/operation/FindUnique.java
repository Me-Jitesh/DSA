package array.operation;

//From Code Studio
public class FindUnique {

    public void findUniqueMethod1(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Unique Element is : " + ans);
    }
}
