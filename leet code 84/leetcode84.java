public class leetcode84 {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        // creating next smaller element array
        int[] nse = new int[n];
        nse[n-1] = n;

        for(int i=n-2; i>=0; i--){
            int j = i+1;

            while(j<n &&  heights[j] >= heights[i]) j = nse[j];
            
            nse[i] = j;
        }

        // creating prev smaller element array
        int[] pse = new int[n];
        pse[0] = -1;

        for(int i=1; i<n; i++){
            int j = i-1;

            while(j>=0 &&  heights[j] >= heights[i]) j = pse[j];
            
            pse[i] = j;
        }

        // max area
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }

        return max;
    }
}
