package TUF.STEP2.Sort1;


import java.util.Arrays;

public class Bubble {

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static void sort(int arr[]){
        int n  = arr.length;
        for (int i=0;i<n;i++){
            for (int j = 0;j<n-1-i;j++){
                if (arr[j+1] < arr[j]){
                    swap(arr,j+1,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
