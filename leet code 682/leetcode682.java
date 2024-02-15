import java.util.Stack;

public class leetcode682 {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for(String s: operations){

            if(s.equals("C")){
                sum -= st.pop();
            }
            else if(s.equals("D")){
                int n = st.peek() * 2;
                st.push(n);
                sum += st.peek();
            }
            else if(s.equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                int n3 = n1+n2;
                st.push(n2);
                st.push(n1);
                st.push(n3);
                sum += st.peek();
            }
            else{
                int n = Integer.parseInt(s);
                st.push(n);
                sum += n;
            }

        }

        return sum;
    }
}
