package TUF.binarySearch;

public class NthRoot {

    public static int findNthRoot(int N, int M) {
        int low = 0;
        int high = M;
        while(low<=high){
            int mid = low +(high-low)/2;
            int pow = N;
            long val = 1;
            while(pow>0){
                val = val*mid;
                pow--;
                if (val > M) break;
            }
            if(val==M) return mid;
            else if(val<M) {
                low = mid+1;
            }
            else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int N = 3;   // root
        int M = 27;  // number

        int result = findNthRoot(N, M);

        if (result==-1)
            System.out.println("No exact "+ N +"th root exists for "+ M);
        else
            System.out.println(N+"th root of "+M+" is "+result);
    }
}
