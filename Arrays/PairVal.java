package Arrays;

public class PairVal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,7,65,4,3};
        int val = 6;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==val){
                        System.out.println("The pairs are "+arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }

            }
        }
    }
}
