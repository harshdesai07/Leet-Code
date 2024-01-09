public class leetcode53 {
    // Function Definition
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maximum sum with the first element
        int currentSum = nums[0]; // Initialize current sum with the first element

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Calculate the current sum considering whether to start a new subarray or continue the current one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};

        // Function calling
        int max_sum = maxSubArray(arr);

        System.out.println(max_sum);
    }
}
