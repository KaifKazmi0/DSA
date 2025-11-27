package TUF.STEP1.Pattern;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        int spaces = 0;
        int stars = 2*n-1;

        for (int i=1;i<=n;i++){

            for (int j=1;j<=spaces;j++){
                System.out.print("  ");
            }

            for (int k=1;k<=stars;k++){
                System.out.print("* ");
            }

            spaces++;
            stars-=2;
            System.out.println();
        }

        /*for (int i=5;i>=1;i--){
            for (int j=1;j<=5-i;j++){
                System.out.print("  ");
            }

            for (int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        } */
    }
}
