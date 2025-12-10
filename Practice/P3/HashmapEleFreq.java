package Practice.P3;

import java.util.HashMap;

public class HashmapEleFreq {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,1,1,2,3,4,3,21,2,32,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int x: arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int MaxFreq = Integer.MIN_VALUE;
        int MaxFreqEle = -1;

        for (int key : map.keySet()){
            int freq = map.get(key);

            if(MaxFreq< freq){
                MaxFreq = freq;
                MaxFreqEle = key;
            }

        }

        System.out.println(MaxFreqEle);
        System.out.println(MaxFreq);
    }
}
