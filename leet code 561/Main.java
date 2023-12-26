import java.util.*;
public class Main{
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for(int i=0; i<nums.length; i=i+2){
            sum = sum + nums[i];
        }

        return sum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,9,5,4,2,7};

        int ans = arrayPairSum(arr);

        System.out.println("Maximum sum is: "+ans);

    }
}