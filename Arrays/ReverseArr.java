package Arrays;

public class ReverseArr {
    public static void swap(int i,int j,int arr[]){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    public static void PrtArr(int arr[]){
        for (int i: arr){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i = 0, j = arr.length-1;
        PrtArr(arr);
        while (i<j){
            swap(i++,j--,arr);
        }
        PrtArr(arr);

    }
}
