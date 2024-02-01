import java.util.HashMap;
import java.util.Map;

public class leetcode1679{
     public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int count = 0;

        for(int num: nums){
            if(hm.containsKey(k-num) && hm.get(k-num)>0) {
                count++;
                hm.put(k-num, hm.get(k-num)-1);
            }
            
            else hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        return count;
    }
}