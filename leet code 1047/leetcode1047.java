import java.util.*;

public class leetcode1047 {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }

        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
