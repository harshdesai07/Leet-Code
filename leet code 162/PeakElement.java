public class PeakElement {
    public static int findPeak(int[] arr, int l, int h, int n) {
        int mid = l+(h-l)/2;

        if( (mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]) ){
            return mid;
        }
        else if(mid>0 && arr[mid-1]>arr[mid]){
            return findPeak(arr, l, mid-1, n);
        }
        else{
            return findPeak(arr, mid+1, h, n);
        }
    }
        
    
    public static void main(String[] args) {
        int arr[]={1,2,3,1};

        int ans = findPeak(arr, 0, arr.length-1, arr.length);

        System.out.println(ans);

    }
}
