package Arrays.OtherProblems;

import java.util.Arrays;

public class PrefixSumsInPlace {
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,4};
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
