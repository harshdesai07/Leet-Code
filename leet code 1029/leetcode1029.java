import java.util.*;

public class leetcode1029 {
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        });
      
        int a = 0, n=costs.length;
        for(int i=0; i<n/2; i++){
            a += costs[i][0];
                  
        }
      
        for(int i=n/2; i<n; i++){
            a += costs[i][1];
                  
        }
    
        return a;
    }
}

