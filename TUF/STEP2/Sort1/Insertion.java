package TUF.STEP2.Sort1;


import java.util.Arrays;

public class Insertion {
    static void sort(int arr[]){
        int n = arr.length,i,j,num;
        for (i=1;i<n;i++){
            num = arr[i];
            //sorted part
            for (j=i-1;j>=0;j--){
                if(arr[j]>num){
                    arr[j+1] = arr[j];
                }else break;
            }
            //here j can be -1 one so j+1 will handle it as well
            arr[j+1] = num;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

//        System.out.println(Arrays.toString(arr));
        sort(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
