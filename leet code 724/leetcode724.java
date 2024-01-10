public class leetcode724 {
    public static int findPivot(int[] nums){
        // Space Complexity : O(1)
        // Time Complexity : O(n)

        int totalSum = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            totalSum += nums[i];
        }

        int LeftSum = 0, RightSum = totalSum;
       
       for(int i=0; i<n; i++){
           RightSum -= nums[i];

           if(RightSum == LeftSum) return i;

           LeftSum += nums[i];
       }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};

        // Function Calling
        int ans = findPivot(arr);

        System.out.println(ans);

    }
}
