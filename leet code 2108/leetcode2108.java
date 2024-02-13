
class leetcode2108 {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            int n = s.length();
            int i = 0, j=n-1;
            boolean flag = true;

            while(i<=j){
                if(s.charAt(i) != s.charAt(j)){
                    flag = false; 
                    break;
                } 
                i++;
                j--;
            }

            if(flag) return s;

        }

        return "";
    }
}
