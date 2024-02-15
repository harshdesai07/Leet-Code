import java.util.*;
public class leetcode2971 {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        long pSum = 0;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            pSum += nums[i];
        }

        for(int i=n-1; i>0; i--){
            long sum = pSum - nums[i];

            if(sum > nums[i]) return pSum;
            else pSum = sum;
        }

        return -1;
    }
}
