package TUF.STEP1.Pattern;

public class P18 {
    public static void main(String[] args) {
        int n =5 , a = 69;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(((char)a++)+" ");
            }
            a = 69 -i;
            System.out.println();
        }
    }
}
