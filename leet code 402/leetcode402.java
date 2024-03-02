import java.util.*;

public class leetcode402 {
    public String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<num.length(); i++){
            int n = num.charAt(i) - '0';

            while(st.size() > 0 && st.peek() > n && k>0){
                st.pop();
                k--;
            }  
            st.push(n);
        }

        while(k>0){
            st.pop();
            k--;
        } 

        StringBuilder sb = new StringBuilder();

        for(int n: st) sb.append(n);

        while(sb.length()>1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        
        return sb.toString();
    }
}
