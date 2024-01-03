

public class leetcode605 {
    //Function Definiion
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            //Checks whether the flower is present at (i+1)th and (i-1)th position
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;

                //n==0 signifies that all the flowers were placed corectly
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1};
        int n = 1;

        boolean ans = canPlaceFlowers(arr, n);
        System.out.println(ans);
    }
    
}
