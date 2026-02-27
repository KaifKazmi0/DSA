package TUF.binarySearch;




public class SQRT {

    public static int findSqrt(int num){
        int n = -1;
        int low = 0;
        int high = num;
        while (low<=high){
            int mid = low + (high-low)/2;
            long val = (long)mid*mid;
            if(val==num) return mid;
            if(val<num){
                n = mid;
                low = mid+1;
            }else high = mid-1;
        }
        return n;
    }

    public static void main(String[] args) {
        int num = 9;
        int sq = findSqrt(num);
        System.out.println("The square root of "+num+" is "+sq);
    }
}
