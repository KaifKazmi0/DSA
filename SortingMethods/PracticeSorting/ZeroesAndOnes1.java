package SortingMethods.PracticeSorting;

import java.util.Arrays;

public class ZeroesAndOnes1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) count++;
        }
        for(int i=0;i<arr.length;i++){
            if(count!=0) {
                arr[i]=0;
                count--;
            }
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
