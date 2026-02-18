package Arrays.binarySearch;

public class BSIterative {

    private static boolean myBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(target==arr[mid])  return true;
            else if (target > arr[mid]) {
                low = mid+1;
            }else high = mid-1;
        }
        return false;
    }

    static boolean myBinarySearchRecurr(int[] arr,int low,int high,int target){
        if(low>high) return false;
        int mid = low + (high-low)/2;
        if(target==arr[mid]) return true;
        else if( target>arr[mid]) return myBinarySearchRecurr(arr,mid+1,high,target);
        else return myBinarySearchRecurr(arr,low,mid-1,target);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 0;
        while(target!=10){
            System.out.printf("%d is present: %b \n",target,myBinarySearchRecurr(arr,0,arr.length-1,target));
            System.out.printf("%d is present: %b \n",target,myBinarySearch(arr,target));
            System.out.println();
            target++;
        }

    }
}
