package Arrays._2D_Arrays;

public class SpiralTraverse {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}
                ,      {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int tr,rc,lc,br;
        tr = 0;
        br = arr.length-1;
        rc = arr[0].length-1;
        lc = 0;
        int r = arr.length;
        int c = arr[0].length;
        int totalelement  = 0;

      while(totalelement < r*c){
          for (int i=lc;i<=rc&&totalelement<r*c;i++){
              System.out.print(arr[tr][i]+" ");
              totalelement++;
          }
          tr++;

          for (int i=tr;i<=br&&totalelement<r*c;i++){
              System.out.print(arr[i][rc]+" ");
              totalelement++;
          }rc--;

          for (int i=rc;i>=lc&&totalelement<r*c;i--){
              System.out.print(arr[br][i]+" ");
              totalelement++;
          }br--;

          for (int i=br;i>=tr&&totalelement<r*c;i--){
              System.out.print(arr[i][lc]+" ");
              totalelement++;
          }lc++;
      }

    }
}
