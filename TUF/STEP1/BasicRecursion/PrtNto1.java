package TUF.STEP1.BasicRecursion;

public class PrtNto1 {
    static void prtNumm(int n){
        if(n==0) return;
        System.out.print(n+" ");
        prtNumm(n-1);
    }


    public static void main(String[] args) {
        int n= 10;
        prtNumm(n);
    }
}
