import java.util.*;
public class leetcode1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.isEmpty() || !map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }

        HashSet<Integer> hs = new HashSet<>();

        for(Integer i: map.values()){
            if(hs.contains(i)) return false;
            else hs.add(i);

        }

        return true;


    }

    public static void main(String[] args) {
        int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
