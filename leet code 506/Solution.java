import java.util.*;

class Solution {
    public int max(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i: arr){
            max = Math.max(i, max);
        }

        return max;
    }

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int maxVal = max(score);
        int arr[] = new int[maxVal + 1];
        String ans[] = new String[n];

        Arrays.fill(arr, -1);

        for(int i=0; i<n; i++){
            arr[score[i]] = i;
        } 

        int rank = 1;

        for(int i=maxVal; i>=0; i--){
            if(arr[i] != -1){
                if(rank == 1) ans[arr[i]] = "Gold Medal";
                else if(rank == 2) ans[arr[i]] = "Silver Medal";
                else if(rank == 3) ans[arr[i]] = "Bronze Medal";
                else ans[arr[i]] = ""+rank;

                rank++;
            }

            if(rank>n) break;

        }

        return ans;

    }
}
