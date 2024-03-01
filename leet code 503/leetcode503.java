import java.util.*;

public class leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1; i>=0; i--){
            st.push(i);
        }

        for(int i=n-1; i>=0; i--){
            while(st.size() > 0 && nums[st.peek()] <= nums[i]){
                st.pop();
            }

            if(st.size() == 0) ans[i] = -1;
            else ans[i] = nums[st.peek()];
            
            st.push(i);
        }

        return ans;
    }
}
