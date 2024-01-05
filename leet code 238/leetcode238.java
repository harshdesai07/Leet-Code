import java.util.*;

public class leetcode238 {
    public static void productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;

        //fills array with product of elements to its left
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        curr = 1;
        //fills array with product of elements to its right
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        
        for(int i=0; i<n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        productExceptSelf(arr);
    }
}
