public class leetcode1732 {
    // Function Definition
    public static int largestAltitude(int[] gain) {
        for(int i=1; i<gain.length; i++){
            gain[i] += gain[i-1]; 
        }

       int max = Integer.MIN_VALUE;
        for (int value : gain) {
            if (value > max) max = value;
        }

        if(max<0) return 0;
        else return max;
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};

        System.out.println(largestAltitude(arr));
    }
}
