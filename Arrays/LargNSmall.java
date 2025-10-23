package Arrays;

import java.util.Scanner;

public class LargNSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,-35,3,2,45,6,2,4};

        int lar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (lar<arr[i]){
                lar = arr[i];
            }
            if(small>arr[i]){
                small = arr[i];
            }
        }
        System.out.println("The largest element in the array is "+lar);
        System.out.println("The smallest element is "+small);

    }
}
