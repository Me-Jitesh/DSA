package array.operation;

//From Code Studio

public class FindIntersection {

    public void findIntersectionMethod1(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            int element = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (element == arr2[j]) {
                    System.out.println(element + " is mapped with " + arr2[j]);
                    arr2[j] = Integer.MIN_VALUE;// So that it cannot map with another one
                    break;
                }
            }
        }
    }

    public void findIntersectionMethod1Opti(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        while ((i < arr1.length) && (j < arr2.length)) {
            if (arr1[i] == arr2[j]) {
                System.out.println(arr1[i] + " is mapped with " + arr2[j]);
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
