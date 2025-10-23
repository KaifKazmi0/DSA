package Arrays._2D_Arrays;
import java.util.Arrays;

public class MultiplyArray {
    static void multiplyArray(int a[][],int b[][]){
        int r1,c1,r2,c2;
        c1 = a[0].length;
        r1 = a.length;
        c2 = b[0].length;
        r2 = b.length;

        if(c1!=r2) return;
        int c[][] = new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    c[i][j] +=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(c));
    }

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{1,2,3}};
        int b[][] = {{1,2},{1,2},{1,2}};

        multiplyArray(a,b);

    }
}
