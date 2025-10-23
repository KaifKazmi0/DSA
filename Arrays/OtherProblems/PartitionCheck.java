package Arrays.OtherProblems;

import java.util.Arrays;

class hey{
    int totalsum(int arr[]){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

}


public class PartitionCheck {
    static boolean partitionCheck(int arr[],int totalsum){

        if (totalsum%2!=0){
            return false;
        }

        int prefix = 0;
        for (int i=0;i<arr.length;i++){
            prefix = prefix + arr[i];
            int suffixSum = totalsum - prefix;
            if(suffixSum == prefix) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        hey obj = new hey();
        int arr[] = {1,2,3,4,5,6};
        int sum = obj.totalsum(arr);

        System.out.println("Partition is possible of array : "+ Arrays.toString(arr) +" "+partitionCheck(arr,sum));

        int arr2[] = {1,2,3,4,5,5};
        int sum2 = obj.totalsum(arr2);
        System.out.println("Partition is possible of array : "+ Arrays.toString(arr2) +" "+partitionCheck(arr2,sum2));
    }
}
