package Arrays._2D_Arrays.SumOfRectangle;

public class BruteForce {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1}};

        int l1=2,r1=2,l2=5,r2=5,sum=0;

        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("the sum of the rectangle is: "+sum);

    }
}
