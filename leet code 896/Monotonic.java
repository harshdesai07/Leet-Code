public class Monotonic {
    public static boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        boolean flag1 = false;
        boolean flag2 = false;

        while(i<nums.length-1 && j<nums.length){
            if(nums[i]>nums[j]){
                flag1 = true;
            }
            if(nums[i]<nums[j]){
                flag2 = true;
            }
            
            i++;
            j++;
        } 


        if(flag1 && flag2){
                return false;
        }
        else {
            return true;
        }
        
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2};

        boolean ans = isMonotonic(arr);
        System.out.println(ans);
    }
}
