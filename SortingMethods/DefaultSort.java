package SortingMethods;

import java.util.Arrays;

public class DefaultSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,1,2,3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
