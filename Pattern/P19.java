package Pattern;

public class P19 {
    public static void main(String[] args) {
        int n=5;
        int row;
        for (int i=1;i<=2*n-1;i++){
            row = (i<n)?i:2*n-i;
            for (int j=n-row;j>=1;j--){
                System.out.print("*");
            }
            for (int k=1;k<=2*row-1;k++){

                    System.out.print(" ");
            }
            for (int j=n-row;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
