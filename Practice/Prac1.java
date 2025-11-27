package Practice;

public class Prac1 {
    public static void main(String arg[]){
        int a = 0;
        int b = 1;
        for (int i=1;i<=4;i++){
            System.out.println(a);


            int temp = a+b;
            a = b;
            b = temp;
        }
    }

}
