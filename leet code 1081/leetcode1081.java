import java.util.*;

public class leetcode1081 {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++; 
        }
        
        boolean[] seen = new boolean[26]; 
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch-'a']--;

            if (seen[ch-'a']) continue; 

            while (!st.isEmpty() && st.peek() > ch &&  freq[st.peek()-'a'] > 0){
                char c = st.pop();
                seen[c-'a'] = false; 
            }

            st.push(ch); 
            seen[ch-'a'] = true; 
        }

        StringBuilder sb = new StringBuilder();
        
        while (!st.isEmpty()) sb.append(st.pop());

        return sb.reverse().toString();
    }
}
