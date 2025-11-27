package TUF.STEP1.BasicRecursion;

public class Factorial {
    static int chkFactorial(int n){
        if(n==0) return 1;
        return n*chkFactorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int facto = chkFactorial(n);
        System.out.println(facto);
    }
}
