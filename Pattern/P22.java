package Pattern;

public class P22 {
    public static void main(String[] args) {
        int n =4;
        int dr,dc;
        int val;
        int center = (2*n-1)/2;
        for (int i=0;i<2*n-1;i++){
            for (int j=0;j<2*n-1;j++){
                dr = Math.abs(i - center);
                dc = Math.abs(j-center);
                val = Math.max(dr,dc)+1;
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
