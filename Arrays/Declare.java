package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Declare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter num: ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        System.out.println("Enter Array elements");
//        for(int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
        int arr[] = {1,2,3,4,5};
        int arr2[] = arr.clone();
        int arr3[] = Arrays.copyOfRange(arr,2,5);
        arr[1] = 0;
        arr[2] = 0;
        System.out.println("The Array is ");
        for (int i : arr3){
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
