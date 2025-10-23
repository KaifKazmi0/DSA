package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = sc.nextInt();
        k = k%n;
        int m = 0;

        int ans[] = arr.clone();
        for(int i=n-k;i<n;i++){
            arr[m++] = ans[i];
        }
        for (int i=0;i<n-k;i++){
            arr[m++] = ans[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
