package TUF.STEP1.BasicMath;

public class CountDigit {
    public static void main(String[] args) {
        int a = 0;
        int count=0;
        while(a>0){
            a = a/10;
            count++;
        }
        System.out.println(count);
    }
}
