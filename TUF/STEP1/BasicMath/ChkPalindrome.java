package TUF.STEP1.BasicMath;

public class ChkPalindrome {
    public static void main(String[] args) {
        int a = 1221;
        int b = 0;
        int c = a;
        while (c>0){
            b = b*10 + c%10;
            c/=10;
        }
        if (b==a) System.out.println("is palindrome");
        else System.out.println("not palindrome");

    }
}
