package SortingMethods.PracticeSorting;

import java.util.Arrays;

import static SortingMethods.PracticeSorting.ZeroesAndOnes.swap;

public class EvenAndOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        System.out.println(Arrays.toString(arr));

        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swap(arr,i,j);
                i++; j--;
            }
            else if(arr[i]%2==0) i++;
            else if(arr[j]%2!=0) j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
