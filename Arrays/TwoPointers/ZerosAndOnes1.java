package Arrays.TwoPointers;

import java.util.Arrays;

public class ZerosAndOnes1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1,0,1,0,1,0,1};
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==0) flag++;
        }
        for (int i=0;i<arr.length;i++){
            if (flag>0){
                arr[i] = 0;
                flag--;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
