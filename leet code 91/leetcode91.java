import java.util.*;
public class leetcode91 {
    class Solution {
        public int helper(String s, int idx, int[] dp){
            // base case
            if(idx==s.length()) return 1;
            // if(s.charAt(idx)=='0') return 0;
            
            if(dp[idx] != -1) return dp[idx];
    
            // we have two choices for each element
            // 1. combine the i+1 element with ith element
            // here we have all the possibilites of i+2 elements + combine element
            int combine = 0;
            if(idx<s.length()-1 && (s.charAt(idx)=='1' || s.charAt(idx)=='2' && s.charAt(idx+1)<='6')) combine = helper(s, idx+2, dp);
            
            // 2. not combine the i+1 element with ith element
            // here we have all the possibilites of i+1 elements + not combine element
            int not_combine = 0;
            if(s.charAt(idx)!='0') not_combine = helper(s, idx+1, dp);
    
            // Now return all the posibilities
            return dp[idx] = combine + not_combine;
        }
    
        public int numDecodings(String s) {
            int[] dp = new int[s.length()];
    
            // filling array with -1
            Arrays.fill(dp, -1);
    
            return helper(s, 0, dp);
    
            
        }
    }
}
