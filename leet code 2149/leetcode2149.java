public class leetcode2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int e = 0;
        int o = 1;

        for(int i=0; i<ans.length; i++){
            if(nums[i] > 0){
                ans[e] = nums[i];
                e+=2;
            }
            else{
                ans[o] = nums[i];
                o+=2;
            }

        }

        return ans;
    }
}
