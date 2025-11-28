package TUF.STEP1.Hashing;

import java.util.HashMap;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 1, 2, 1};
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        System.out.println(map);

        int MaxFreq = Integer.MIN_VALUE;
        int MaxFreqEle = -1;

        for (int key: map.keySet()){
            int freq = map.get(key);

            if (freq > MaxFreq){
                MaxFreq = freq;
                MaxFreqEle = key;
            }

        }

        System.out.println("Max Freq Element: "+MaxFreqEle);
        System.out.println("Frequency: "+MaxFreq);
    }
}
