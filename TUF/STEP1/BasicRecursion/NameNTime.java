package TUF.STEP1.BasicRecursion;

public class NameNTime {
    static void prtName(String s , int n){
        if(n==0) return;
        System.out.print(s+" ");
        prtName(s,n-1);
    }

    public static void main(String[] args) {
        String s = "Joe";
        int n = 9;

        prtName(s,n);
    }
}
