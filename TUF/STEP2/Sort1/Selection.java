package TUF.STEP2.Sort1;

import java.util.Arrays;

public class Selection {
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int arr[]){
        int n = arr.length;
        int minIdx ;
        for (int i=0;i<n;i++){
            minIdx = i;
            for (int j =i+1;j<n;j++){
                if (arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr,i,minIdx);
        }
    }


    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
