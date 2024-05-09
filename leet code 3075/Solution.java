import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int n = happiness.length;
        Arrays.sort(happiness);
        int i = n - 1;
        int m = 0;

        if (k == 1)
            return happiness[n - 1];

        while (k > 0) {
            if (happiness[i] - m > 0)
                ans += happiness[i] - m;
            k--;
            i--;
            m++;
        }

        return ans;

    }
}