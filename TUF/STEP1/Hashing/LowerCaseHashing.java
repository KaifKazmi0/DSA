package TUF.STEP1.Hashing;

import java.nio.Buffer;
import java.util.Scanner;

public class LowerCaseHashing {
    public static void main(String[] args) {
        //String only contains small characters
        String s = "abacdeafgagba";

        int hash[] = new int[26];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int a =5;
        Scanner sc = new Scanner(System.in);
        char ch;
        while(a>0){
            ch = sc.nextLine().charAt(0);
            System.out.println(hash[ch-'a']);
            a--;
        }

    }
}
