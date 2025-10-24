package Arrays._2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter Rows and coloms: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter Matrix elements in row wise.");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int brr[][] = new int[arr[0].length][arr.length];




        //yaha pe rows and cols num exchange kiya h agar square matrix hua to farq nhi padega aur non-square matrix bhi chal jaega
        for (int i=0;i<arr[0].length;i++){
            for (int j=0;j<arr.length;j++){
                brr[i][j] = arr[j][i];
            }
        }

        for (int i=0;i< brr.length;i++){
        System.out.println(Arrays.toString(brr[i]));

        }
    }
}
