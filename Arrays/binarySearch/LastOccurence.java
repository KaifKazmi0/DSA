package Arrays.binarySearch;

public class LastOccurence {

    static int findFO(int arr[],int target){
        int low = 0;
        int high  = arr.length-1;
        int fo = -1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if(target==arr[mid]) {
                fo = mid;
                low = mid +1;
            }
            else if (target>arr[mid]){
                low = mid+1;
            }
            else high = mid-1;
        }
        return fo;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,5,5,5,5,6,6,7,7,7,8,8,9,9,9};
        int target = 5;
        int lo = findFO(arr,target);
        System.out.print(lo);
    }
}
