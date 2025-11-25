package Pattern;

public class P16 {
    public static void main(String[] args) {
        int n = 5 , a = 65;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(((char)a)+" ");
            }
            a++;
            System.out.println();
        }
    }
}
