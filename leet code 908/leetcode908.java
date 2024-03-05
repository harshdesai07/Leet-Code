public class leetcode908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];

        for(int num: nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int ans = (max-min) - (2*k);

        return (ans > 0) ? ans: 0;
    }
}
