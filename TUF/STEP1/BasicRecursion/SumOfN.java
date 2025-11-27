package TUF.STEP1.BasicRecursion;

public class SumOfN {
    static int checkSum(int n){
        if (n < 0) {
            System.out.println("Invalid input.");
            return 0;
        }

        if(n==0) return 0;
        return n+checkSum(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        int sum = checkSum(n);
        System.out.println(sum);
    }
}
