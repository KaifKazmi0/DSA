package TUF.STEP1.BasicMath;

public class GCD {
    static int checkGcd(int a,int b){
        int num = Math.min(a,b);
        for (int i = num;i>=1;i--){
            if (a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 11;
        int m = 18;
        int a = checkGcd(n,m);
        if (a<0){
            System.out.println("There is not any GCD of given nums");
        }else  System.out.println("The GCD is "+a);
    }
}
