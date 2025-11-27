package TUF.STEP1.Pattern;

public class P20 {
    public static void main(String[] args) {
        int n = 5;
        int row;
        for (int i=1;i<=2*n-1;i++){
            row = (i<n)?i:2*n-i;
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            for (int k=(2*n)-(2*row-1);k>1;k--){
                System.out.print(" ");
            }
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
