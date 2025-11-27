package TUF.STEP1.BasicRecursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrReverse {

   static void revArr(int[] arr,int i,int j){
       if (i>j) return;
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
       revArr(arr,i+=1,j-=1);

   }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        revArr(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
