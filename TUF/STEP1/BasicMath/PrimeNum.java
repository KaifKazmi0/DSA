package TUF.STEP1.BasicMath;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 13,a=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                a++;
            }
        }
        if(a==2){
            System.out.println("num is prime");
        }else System.out.println("num is not prime");
    }
}
