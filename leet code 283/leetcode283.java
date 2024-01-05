

public class leetcode283 {
    public static void moveZeroes(int[] nums) {

    if (nums == null || nums.length == 0) return;    

    int j = 0; //it keeps the track of first occured zero
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }
    }
}

public static void main(String[] args) {
    int arr[] = {0,1,0,3,12};
    moveZeroes(arr);

    for(int i: arr){
        System.out.print(i + " ");
    }
    System.out.println();
}
}
