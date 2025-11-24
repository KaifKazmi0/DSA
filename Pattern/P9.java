package Pattern;

public class P9 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2*n; i++) {

            if(i<=n){
                for (int j = n-i+1;j>=1;j--){
                    System.out.print(" ");
                }

                for(int k = 1;k<=2*i-1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                for (int j=1;j<=i-n;j++){
                    System.out.print(" ");
                }

                for(int k=1;k<=2*n-(i%n);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
