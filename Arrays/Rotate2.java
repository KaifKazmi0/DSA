package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate2 {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = sc.nextInt();
        k = k%n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
}
