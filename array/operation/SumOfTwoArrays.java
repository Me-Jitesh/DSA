package array.operation;

import java.util.ArrayList;

//From CodeStudio
public class SumOfTwoArrays {
    public void sumOfTwoArraysMethod1(int[] arr1, int[] arr2) {

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i >= 0 && j >= 0) {
            int val1 = arr1[i];
            int val2 = arr2[j];

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
            j--;
        }

        while (i >= 0) {
            int sum = arr1[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }

        while (j >= 0) {
            int sum = arr1[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }

        while (carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        ans = reverse(ans);
        System.out.println("Sum = " + ans.toString());
    }

    private ArrayList<Integer> reverse(ArrayList<Integer> ans) {
        int s = 0;
        int e = ans.size() - 1;

        while (s < e) {
            swap(ans, s++, e--);
        }
        return ans;
    }

    private ArrayList<Integer> swap(ArrayList<Integer> arr, int s, int e) {
        int temp = arr.get(s);
        arr.set(s, arr.get(e));
        arr.set(e, temp);
        return arr;
    }
}
