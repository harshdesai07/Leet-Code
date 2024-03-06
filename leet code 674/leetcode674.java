public class leetcode674 {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        int count = 1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+1]) count++;
            else {
                ans = Math.max(ans,count);
                count=1;
            } 
        }

        return Math.max(ans,count);
    }
}
