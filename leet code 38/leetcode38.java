public class leetcode38 {

    public static int findPivot(int[] arr, int l, int h){
        if(h<l) return -1;
        int mid = l + (h-l)/2;

        if(mid<h && arr[mid] > arr[mid+1]){
            return mid;
        }
        else if(mid>l && arr[mid-1] > arr[mid]){
            return mid-1;
        }
        else if(arr[l] >= arr[mid]){
            return findPivot(arr, l, mid-1);
        }
        else{
           return findPivot(arr, mid+1, h);
        }
    }

    public static int binarysearch(int[] arr, int target, int l, int h){
        if(h<l) return-1;

        int m = l+(h-l)/2;

        if(target == arr[m]) return m;
        else if(target>arr[m]) return binarysearch(arr, target, m+1, h);
        else return binarysearch(arr, target, l, m-1);

    }

    public static int search(int[] nums, int target) {
        int l =0;
        int h = nums.length-1;
        int pivot = findPivot(nums, l, h);

        if(pivot == -1){
            return binarysearch(nums, target, l, h);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[l]){
            return binarysearch(nums, target, l, pivot-1);
        }
        else{
            
            return binarysearch(nums, target, pivot+1, h);
        }
            
        
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3};
        int target = 10;

        int ans = search(arr, target);
        System.out.println(ans);
    }
}