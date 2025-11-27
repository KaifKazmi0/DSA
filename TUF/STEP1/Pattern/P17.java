package TUF.STEP1.Pattern;

public class P17 {
    public static void main(String[] args) {
        int n =5;
        int ch = 65;
        for (int i=1;i<=n;i++){
            for (int j=n-i+1;j>=1;j--){
                System.out.print(" ");
            }
            ch = 65;
            for (int k=1;k<=2*i-1;k++){

                if(k<(((2*i-1)/2)+1)){
                    System.out.print((char)(ch++)+" ");
                }
                else {
                    System.out.print((char)(ch--) + " ");
                }
            }
            System.out.println();
        }
    }
}
