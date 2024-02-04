public class leetcode1143{
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        
        // Use a 1D array to store the current row and the previous row
        int[] dp = new int[n + 1];
    
        for (int i = 1; i <= m; i++) {
            int prev = 0; // Store the value of the previous row at dp[j-1]
            for (int j = 1; j <= n; j++) {
                int temp = dp[j]; // Store the current value of dp[j]
    
                // Match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[j] = 1 + prev;
                } else {
                    // Not match
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
    
                prev = temp; // Update prev for the next iteration
            }
        }
    
        return dp[n];
    }    
}