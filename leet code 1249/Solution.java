public class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                sb.append(ch);
            }
            else if(ch == ')'){
                if(count > 0){
                    sb.append(ch);
                    count--;
                } 
            }
            else{
                sb.append(ch);
            }
        }

        StringBuilder sb1 = new StringBuilder();
       
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '(' && count>0){
                count--;
            }
            else{
                sb1.append(sb.charAt(i));
            }
        }
        
        return sb1.reverse().toString();
    }
}