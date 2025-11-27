package TUF.STEP1.BasicRecursion;

public class StringPalindrome {
    static boolean chkStr(String s,int i,int j){
        if(i>j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return chkStr(s,i+1,j-1);

    }

    public static void main(String[] args) {
        String s = "1234321";
        if(chkStr(s,0,s.length()-1)) System.out.println("The string is palindrome");
        else System.out.println("String is not Palindrome");
    }
}
