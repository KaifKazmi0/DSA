package TUF.STEP1.BasicMath;

public class ArmStrong {
    public static void main(String[] args) {
        int a = 153;
        int b = a;
        int n = 0;
        while (b>0){
            b/=10;
            n++;
        } b =a;
        int temp = 0;
        int m = 0;
        for (int i=1;i<=n;i++){
            temp = b%10;
            b/=10;
//            for (int j=1;j<=n;j++){
//                pow *=temp;
//            }
//            m += pow ;

            // Instead use below method to optimize code
            m += Math.pow(temp, n);
        }

            if (m == a){
            System.out.println("is Armstrong");
        }else System.out.println("is not Armstrong");

    }
}
