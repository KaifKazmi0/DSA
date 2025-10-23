package Arrays._2D_Arrays;

import java.util.Arrays;

public class AddMatrix {
    static void addMatrices(int A[][], int B[][]){
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;
        if(r1==r2 && c1==c2){
           int C[][] = new int[r1][c1];
           for (int i=0;i<r1;i++){
               for (int j=0;j<c1;j++){
                   C[i][j] = A[i][j] + B[i][j];
               }
           }
            System.out.println(Arrays.deepToString(C));
        }
        else {
            System.out.println("Matrices cant be added as they are of diff deminsions ");
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] B = {
                {7, 8, 9},
                {1, 2, 3}
        };


        addMatrices(A,B);
    }
}
