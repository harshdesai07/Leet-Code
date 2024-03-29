import java.util.*;
public class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0, j=0;
        int n = nums.length;
        int len = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        while(j<n){
            int m = nums[j];
            hm.put(m, hm.getOrDefault(m, 0)+1);

            while(hm.get(m) > k){
                hm.put(nums[i], hm.get(nums[i]) - 1);
                i++;
            }

            len = Math.max(len, (j-i+1));
            j++;
        }

        return len;
    }
}
