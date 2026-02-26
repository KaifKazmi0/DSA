package TUF.binarySearch;

public class UpperBound {

    public static int upperBound(int[] nums, int x) {
        int res = nums.length;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>x){
                res = mid;
                high = mid -1;
            }else low = mid+1;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 5, 7};
        int x = 4;

        int ans = upperBound(arr, x);

        System.out.println("Upper Bound Index: " + ans);
    }
}