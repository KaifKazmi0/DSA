package TUF.STEP1.Hashing;

import java.util.HashMap;

public class HmapForInteger {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,4,3,2,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        System.out.println(map);
    }
}
