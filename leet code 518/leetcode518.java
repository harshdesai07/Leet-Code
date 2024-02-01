public class leetcode518 {
    class Solution {
        public int change(int amount, int[] coins) {
            int[][] dp = new int[coins.length + 1][amount + 1];
            for(int i=0; i<=coins.length; i++) dp[i][0] = 1;
    
            for(int i=1; i<=coins.length; i++){
                for(int j=1; j<=amount; j++){
                    int pick = 0;
                    if(j>=coins[i-1]) pick = dp[i][j-coins[i-1]];
                    int not_pick = dp[i-1][j];
    
                    dp[i][j] = pick + not_pick;
                }
            }
            return dp[coins.length][amount];
            
        }
    }
}
