package TUF.STEP1.BasicMath;

public class GCD_Euclid {
    static int checkGCD(int a , int b){
        while (b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        System.out.println(checkGCD(Math.max(a,b),Math.min(a,b)));
    }
}
