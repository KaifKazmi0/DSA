package TUF.STEP1.Hashing;

import java.util.Scanner;

public class StrinigCharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "hellomynameiskaif";

        //pre computing
        int[] hash = new int[256];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }


        int a = sc.nextInt();
        char ch;
        while (a>0){
            ch = sc.next().charAt(0);
            System.out.println(hash[ch]);
            a--;
        }

    }
}
