package TUF.binarySearch;

public class FloorAndCeil {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int low = 0;
        int high = nums.length-1;
        int floor =-1 ;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]<=x){
                floor = nums[mid];
                low = mid+1;
            }else high = mid-1;
        }

        low = 0;
        high = nums.length-1;
        int ceil=-1 ;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>=x){
                ceil = nums[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int x = 5;

        int[] ans = getFloorAndCeil(arr, x);

        System.out.println("Floor: " + ans[0]);
        System.out.println("Ceil: " + ans[1]);
    }
}
