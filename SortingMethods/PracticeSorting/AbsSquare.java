package SortingMethods.PracticeSorting;
import java.util.Arrays;

public class AbsSquare {
    public static void main(String[] args) {
        int arr[] = {1,-2,4,3,4,-5,4,3,6,-8,-9};
        System.out.println("Original: " + Arrays.toString(arr));

        int result[] = new int[arr.length];
        int left = 0, right = arr.length - 1;
        int index = arr.length - 1; // Fill from largest to smallest

        while (left <= right) {
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                result[index] = arr[left];
                left++;
            } else {
                result[index] = arr[right];
                right--;
            }
            index--;
        }

        System.out.println("Sorted: " + Arrays.toString(result));
    }
}