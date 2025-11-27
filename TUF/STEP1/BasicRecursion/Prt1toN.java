package TUF.STEP1.BasicRecursion;

public class Prt1toN {
    static void prtNum(int n){
        if(n==0) return;
        prtNum(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n = 10;
        prtNum(n);
    }
}
