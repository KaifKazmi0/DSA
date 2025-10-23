package Arrays.TwoPointers;

import java.util.Arrays;

import static Arrays.ReverseArr.swap;

public class ZerosAndOnes2 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0,1,0,1};
        int i=0,j=arr.length-1;

        while (i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(i,j,arr);
                i++;
                j--;
            }
            if(arr[i]==0) i++;
            if (arr[j]==1) j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
