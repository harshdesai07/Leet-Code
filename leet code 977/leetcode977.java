public class leetcode977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int i=0, k=n-1;

        for(int j=n-1; j>=0; j--){
            if(Math.abs(nums[i]) > Math.abs(nums[k])){
                ans[j] = nums[i]*nums[i];
                i++;
            }
            else{
                ans[j] = nums[k]*nums[k];
                k--;
            }
        }

        return ans;
    }
}
