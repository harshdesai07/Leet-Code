

public class leetcode643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // storing the sum of first k elements
       for(int i = 0; i < k; i ++) sum += nums[i];
       int maxSum = sum;

       // sliding window
       for(int i = k; i < nums.length; i ++) {
           sum += nums[i] - nums[i - k]; //moving the window forwad by one step
           maxSum = Math.max(maxSum, sum);
        }
       return (double)maxSum / k;
    }
        
}
