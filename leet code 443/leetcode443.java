
public class leetcode443 {
    public int compress(char[] chars) {
        // Method 1:
        // if(chars.length<=1) return chars.length;

        // StringBuilder s = new StringBuilder();
        // int j=0;

        // for(int i=0; i<chars.length; i++){
        //     while(i<chars.length-1 && chars[i]==chars[i+1]){
        //         i++;
        //     }
    
        //     int n1 = i-j+1;
        //     s.append(chars[j]);
        //     j=i+1;
        //     if(n1>1) s.append(n1);
            
        // } 

        
        // for(int i=0; i<s.length(); i++){
        //     chars[i] = s.charAt(i);
        // }

        // return s.length();

        // Method 2: 
        int i=0;
        for(int j=1, count=1; j<=chars.length; j++,count++){
            if(j==chars.length || chars[j] != chars[j-1]){
                chars[i] = chars[j-1];
                i++;

                if(count>=2){
                    for(char c: Integer.toString(count).toCharArray()){
                        chars[i] = c;
                        i++;
                    }
                }
                count = 0; 
            }
              
        }
        return i;
        
    }
}
