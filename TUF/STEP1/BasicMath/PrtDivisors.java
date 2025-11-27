package TUF.STEP1.BasicMath;

public class PrtDivisors {
    public static void main(String[] args) {
        int n = 40;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
