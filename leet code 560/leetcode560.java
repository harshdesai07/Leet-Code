import java.util.*;

public class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count=0;
    
        for(int num: nums){
            sum+=num;
            if(sum==k) count++;
    
            // Checks if there is a subarray of sum k is present before the current element or not
            if(map.containsKey(sum-k)) count+=map.get(sum-k);
    
            map.put(sum, map.getOrDefault(sum,0)+1);
    
        }
    
        return count;
    }
    
}
