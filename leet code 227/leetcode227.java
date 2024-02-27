import java.util.*;

public class leetcode227 {
    public int calculate(String s) {
        char op = '+';
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                int num = 0;

                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num*10 + (s.charAt(i) -'0');
                    i++;
                }
                i--;

                if(op == '+'){
                    st.push(num);
                }
                else if(op == '-'){
                    st.push(-num);
                }
                else if(op == '*'){
                    int num1 = st.pop();
                    num = num1 * num;
                    st.push(num);
                }
                else if(op == '/'){
                    int num1 = st.pop();
                    num = num1 / num;
                    st.push(num);
                }
            }
            else if(ch != ' '){
                op = ch;
            }
        }

        int ans = 0;
        for(int a: st) ans+=a;

        return ans;
    }
}
