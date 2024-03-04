public class leetcode1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int count=0, max=0;

        for(int[] rec: rectangles){
            int num = Math.min(rec[0], rec[1]);

            if(num > max){
                max = num;
                count = 1;
            }
            else if(num == max){
                count++;
            }
        }

        return count;
    }
}
