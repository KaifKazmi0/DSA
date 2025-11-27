package TUF.STEP1.Pattern;

public class P12 {
    public static void main(String[] args) {
        int n = 5;
       for (int i=n;i>=1;i--){
           for (int j=1;j<=n-i+1;j++){
               System.out.print(j);
           }

           for (int k=1;k<2*i-1;k++){
               System.out.print(" ");
           }


           for (int j=n-i+1;j>=1;j--){
               System.out.print(j);
           }



           System.out.println();
       }
    }
}
