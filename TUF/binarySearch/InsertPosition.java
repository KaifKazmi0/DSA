package TUF.binarySearch;

public class InsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int num = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]) {
                high = mid-1;
            }
            else if(nums[mid] < target){
                num = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        if(num<0) return 0;
        return num+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5));  // 2
        System.out.println(searchInsert(arr, 2));  // 1
        System.out.println(searchInsert(arr, 7));  // 4
        System.out.println(searchInsert(arr, 0));  // 0
    }
}
