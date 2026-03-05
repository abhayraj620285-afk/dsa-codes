package HashMap;

import java.util.HashMap;

public class countPairsDivideByK {
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int num : nums) {
            if (!mp.containsKey(num % k)) {
                mp.put(num % k, 1);
            } else {
                mp.put(num % k, mp.get(num % k) + 1);
            }
        }
        long pairs = 0;
        for(var e : mp.entrySet()){
            int rem = k-e.getKey();
            if(mp.containsKey(rem)){
                pairs+=e.getValue()*mp.get(rem);
            }
        }



    return 0;
    }
}
