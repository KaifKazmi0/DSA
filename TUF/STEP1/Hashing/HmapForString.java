package TUF.STEP1.Hashing;

import java.util.HashMap;

public class HmapForString {
    public static void main(String[] args) {
        String s = "hellomynameiskaifandiamsleeping";
        HashMap<Character,Integer>freq = new HashMap<>();


        char cr[] = s.toCharArray();
        for (char c: cr){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        System.out.println(freq);
    }
}
