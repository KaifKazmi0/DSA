package Pattern;

public class P6 {
    public static void main(String[] args) {
        int a = 0;
        for (int i=5;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print((++a)+" ");
            }
            a=0;
            System.out.println();
        }
    }
}
