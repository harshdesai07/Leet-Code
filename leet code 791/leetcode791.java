import java.util.*;

public class leetcode791 {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);

            if(hm.containsKey(ch)){
                int n = hm.get(ch);

                while(n>0){
                    sb.append(ch);
                    n--;
                }

                hm.put(ch, 0);
            }
        }

        for(char i: hm.keySet()){
            if(hm.get(i) != 0){
                int n = hm.get(i);

                while(n>0){
                    sb.append(i);
                    n--;
                }
            }
        }

        return sb.toString();
    }
}
