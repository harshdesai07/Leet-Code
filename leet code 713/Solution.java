public class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        
        int i = 0, j=0, count=0, p=1;
        int n = nums.length;

        while(j<n){
            p *= nums[j];

            while(p >= k){
                p /= nums[i];
                i++;
            }

            count += (j-i+1);
            j++;
        }

        return count;
    }
}
