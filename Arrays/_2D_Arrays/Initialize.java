package Arrays._2D_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Initialize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.printf("Enter rows: ");
        n = sc.nextInt();
        System.out.printf("Enter coloms: ");
        m = sc.nextInt();
        int [][] a = new int[n][m];
        for (int i=0;i<n;i++){
            System.out.println(i +" row");
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
        }

    }
}
