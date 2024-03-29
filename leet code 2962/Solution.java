class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0l;
        int max = 0;

        for(int i: nums){
            max = Math.max(max, i);
        }

        int i=0, j=0, n=nums.length;
        int count = 0;

        while(j<n){
            if(nums[j] == max) count++;

            if(count == k){

                while(count == k){
                    ans+=n-j;
                    
                    if(nums[i] == max) count--;
                    i++;
                }
            }

            j++;

        }

        return ans;

    }
}
