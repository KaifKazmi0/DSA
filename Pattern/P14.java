package Pattern;

public class P14 {
    public static void main(String[] args) {

        int n = 5;
        // Type casting char ch = (char) a;
        for (int i=1;i<=n;i++){
            int a = 65;
            for (int j=1;j<=i;j++){
                System.out.print(((char)a++)+" ");
            }
            System.out.println();
        }
    }
}
