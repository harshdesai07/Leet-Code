import java.util.*;
public class leetcode1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = -1;
        for(int n: candies){
            max = Math.max(max, n);
        }
        
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max) ans.add(true);
            else ans.add(false);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {12,1,12}; 
        int extraCandies = 10;

        List<Boolean> ans = kidsWithCandies(arr, extraCandies);
        System.out.println(ans);
    }
    
}
