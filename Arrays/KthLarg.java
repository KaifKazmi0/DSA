package Arrays;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class KthLarg {
    public static int MaxEl(int arr[]){
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {6,5,7,6,7,35};
        int larg ;
        System.out.println("Enter K for Kth largest Element: ");
        int n = sc.nextInt();

        for(int i=1;i<n;i++){

            larg = MaxEl(arr);


            for(int j=0;j<arr.length;j++){
                if(larg==arr[j]) arr[j] = Integer.MIN_VALUE;
            }

        }

        System.out.println("the "+n+"th largest element is "+MaxEl(arr));



    }

}
