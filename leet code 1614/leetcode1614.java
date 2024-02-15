public class leetcode1614 {
    public int maxDepth(String s) {
        int count = 0, ans = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(') {
                count++;
                ans = Math.max(ans, count);
            }
            else if(ch == ')') count--;
        }

        return ans;
    }
}
