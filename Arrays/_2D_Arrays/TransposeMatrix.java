package Arrays._2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {

    static void swap(int brr[][],int i,int j){
        int temp = brr[i][j];
        brr[i][j] = brr[j][i];
        brr[j][i] = temp;
    }


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

        int brr[][] = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                brr[i][j] = arr[i][j];
                brr[j][i] = arr[j][i];
                swap(brr,i,j);
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(brr[i]));
        }
    }
}
