package TUF.STEP1.Pattern;

public class P15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i=n;i>=1;i--){
            int a = 65;
            for (int j=i;j>=1;j--){
                System.out.print(((char)a++)+" ");
            }
            System.out.println();
        }
    }
}
