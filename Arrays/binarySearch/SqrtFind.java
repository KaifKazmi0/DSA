package Arrays.binarySearch;

public class SqrtFind {

    static int findSqrt(int sqr){
        int ans = -1;
        int st = 0;
        int end = sqr;
        while(st<=end){
            int mid = st + (end-st)/2;
            int val = mid*mid;
            if(val==sqr) return mid;
            else if(val<sqr){
                ans = mid;
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int sqr = 25;
        int sqrt = findSqrt(sqr);
        System.out.println(sqr+" -> "+sqrt);
    }
}
