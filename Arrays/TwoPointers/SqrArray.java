package Arrays.TwoPointers;

import java.util.Arrays;

import static Arrays.ReverseArr.swap;

public class SqrArray {
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1,8,0,9,12};
        int i=0,j=arr.length-1;

        for(i=0;i< arr.length;i++){
            if(Math.abs(arr[i])>=Math.abs(arr[j])){
                arr[i] = arr[i]*arr[i];
            }
            else{
                swap(i,j,arr);
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
