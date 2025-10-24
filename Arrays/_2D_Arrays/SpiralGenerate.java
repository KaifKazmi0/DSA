package Arrays._2D_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class SpiralGenerate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m for matrix MxM");
        int m = sc.nextInt();
        int arr[][] = new int[m][m];
        int tr,rc,lc,br;
        tr = 0;
        br = arr.length-1;
        rc = arr[0].length-1;
        lc = 0;
        int r = arr.length;
        int c = arr[0].length;
        int n = 1;

        int totalelment = 0;

       while(totalelment < r*c){
           for(int i=lc;i<=rc&&totalelment < r*c;i++){
               arr[tr][i] = n++;
               totalelment++;
           }tr++;

           for(int i=tr;i<=br&&totalelment < r*c;i++){
               arr[i][rc] = n++;
               totalelment++;
           }rc--;

           for(int i=rc;i>=lc&&totalelment < r*c;i--){
               arr[br][i] = n++;
               totalelment++;
           }br--;

           for(int i=br;i>=tr&&totalelment < r*c;i--){
               arr[i][lc] = n++;
               totalelment++;
           }lc++;
       }

       for (int i=0;i<arr.length;i++){
           System.out.println(Arrays.toString(arr[i]));
       }




    }
}
