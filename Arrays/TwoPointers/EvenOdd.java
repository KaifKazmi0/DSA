package Arrays.TwoPointers;

import java.util.Arrays;

import static Arrays.ReverseArr.swap;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,12,7,8,9,10};
        int i=0,j=arr.length-1;

        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swap(i,j,arr);
                i++;
                j--;
            }
            if(arr[i]%2==0) i++;
            if(arr[j]%2!=0) j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
