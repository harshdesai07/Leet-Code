import java.util.*;

public class leetcode1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        
        List<Integer> li = new ArrayList<>(hm.values());
        Collections.sort(li);
        
        int count = li.size();
        for(int i = 0; i < li.size() && k > 0; i++){
            if (k >= li.get(i)) {
                k -= li.get(i);
                count--;
            } else {
                break;
            }
        }
        
        return count;
    }
}
