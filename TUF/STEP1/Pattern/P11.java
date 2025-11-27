package TUF.STEP1.Pattern;

public class P11 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (num==0){
                    System.out.print(0);
                    num = 1;
                }
                else {
                    System.out.print(1);
                    num = 0;
                }
            }
            System.out.println();
        }
    }
}
