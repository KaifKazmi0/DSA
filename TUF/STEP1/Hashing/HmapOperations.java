package TUF.STEP1.Hashing;

import java.util.HashMap;

public class HmapOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        //printing map
        System.out.println(map);
        System.out.println();

        //get freq or value of any key
        System.out.println(map.getOrDefault(1,0));
        System.out.println(map.getOrDefault(6,0));
        System.out.println(map.get(6));
        System.out.println();

        //check if array constain an element or not
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(6));
        System.out.println();

        //upadate freq of an element in map manually
        System.out.println(map.put(1,1));
        System.out.println(map);
        System.out.println();

        //remove key from map
        map.remove(1);
        System.out.println(map);
        System.out.println();

        //size of map i.e. num of pairs in map
        System.out.println(map.size());


    }
}
