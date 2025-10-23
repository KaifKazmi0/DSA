package Arrays;

public class UniqueEle {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,4};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    arr[j] = arr[i] = -1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]>-1) {
                System.out.println(arr[i]+" is the unique number in the array");
            }
        }
    }
}
