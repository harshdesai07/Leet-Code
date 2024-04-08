class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[] = new int[n];

        for(int[] i: trust){
            arr[i[1] - 1]+=1;
            arr[i[0] -1]-=1;
        }

        for(int i=0; i<n; i++){
            if(arr[i] == n-1) return i+1;
        }

        return -1;
    }
}