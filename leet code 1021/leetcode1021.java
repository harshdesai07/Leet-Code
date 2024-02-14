import java.util.*;

public class leetcode1021 {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            // check for open bracket
            if(ch == '('){
                // check if it is outermost or inner bracket
                if(st.size() > 0){
                    // it is inner bracket 
                    // add to ans
                    sb.append(ch);
                }

                st.push(ch);
            }
            else{
                // check for closed bracket
                st.pop();

                // check if it is outer or inner bracket
                if(st.size() > 0) sb.append(ch);
            }
        }

        return sb.toString();
    }
}
