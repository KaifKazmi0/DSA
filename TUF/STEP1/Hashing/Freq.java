package TUF.STEP1.Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Freq {
    static int[] freq(int arr[]){
        int freq[] = new int[100005];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }

    static int srcEle(int a,int freq[]){
        if(a<0) return -1;
        else return freq[a];
    }



    public static void main(String[] args) {
        int arr[] = {1,2,4,5,4,3,2,1,6,4,3,23,43,2,4};
        //5 -> 1,5,37,53,5


        int[] freq = freq(arr);


        int num = 0;
        for (int i=0;i<5;i++){
            System.out.print("Enter num: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            System.out.print(srcEle(num,freq)+" ");
        }
    }
}
