package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,7,8,4};
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i] = pref[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(pref));
    }
}

