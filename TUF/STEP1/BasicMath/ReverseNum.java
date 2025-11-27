package TUF.STEP1.BasicMath;

public class ReverseNum {
    public static void main(String[] args) {
        int a = 12345;
        int b = 0 ;
        while (a>0){
            b = b*10 + a%10;
            a = a/10;
        }
        System.out.println(b);
    }
}
