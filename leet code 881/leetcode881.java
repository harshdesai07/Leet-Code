import java.util.*;

public class leetcode881 {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0; //number of boats
        int n = people.length;
        Arrays.sort(people);

        int i=0; //represent light weighted people
        int j=n-1; //represent heavy weighted people
        
        while(i<=j){
            if(people[i] + people[j] <= limit){
                j--;
                i++;
            }
            else{
                j--;  

            }
            
            count++;     

        }

        return count;
        
    }

    public static void main(String[] args) {
        int arr[] = {3,5,3,4};
        int limit = 5;

        int ans = numRescueBoats(arr, limit);
        System.out.println(ans);
    }
    
}
