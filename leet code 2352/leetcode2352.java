import java.util.*;

class leetcode2352 {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> r_map = new HashMap<>();
        int count = 0;

        for(int i=0; i<grid.length; i++){
            StringBuilder s = new StringBuilder();
            for(int j=0; j<grid.length; j++){
                s = s.append(grid[i][j]).append("$");
            }

            r_map.put(s.toString(), r_map.getOrDefault(s.toString(), 0)+1);
        }

        for (int m = 0; m< grid.length; m++) {
            StringBuilder s = new StringBuilder();

            for(int n=0; n<grid.length; n++){
                s = s.append(grid[n][m]).append("$");
            }

            if(r_map.containsKey(s.toString())) {
                count+=r_map.get(s.toString()); 
            }
    
        }

        return count;

    }
}
