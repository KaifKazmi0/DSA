package Pattern;

public class P9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=1;i<=2*n;i++){
            int row = (i<=n )?i: 2*n-i+1;

            for (int j=1;j<=n-row;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=2*row-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
