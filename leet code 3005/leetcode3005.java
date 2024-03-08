import java.util.*;
public class leetcode3005 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int max = -1;
        int ans = 0;

        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        for(int n: hm.values()){
            max = Math.max(max, n);
        }

        for(int n: hm.keySet()){
            if(hm.get(n) == max) ans+=max;
        }

        return ans;
    }
}
