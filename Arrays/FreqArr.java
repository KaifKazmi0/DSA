package Arrays;

import java.util.Scanner;

public class FreqArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,7,8,9,6,4,3,67,0,2,1,7};

        int freq[] = new int[100005];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int n ;
        for (int i=0;i<5;i++){
            System.out.print("Enter num: ");
            n = sc.nextInt();
            if (freq[n]>0){
                System.out.println("The entered number exist in the array");
            }else {
                System.out.println("Entered number doesn't exist in the array");
            }
        }
    }
}
