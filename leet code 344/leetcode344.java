
public class leetcode344 {
    public static void main(String[] args) {
        String[] c = {"h","e","l","l","o"};
        int n = c.length;
        int j=n-1;

        for(int i=0; i<n/2; i++){
            String temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            j--;
        }

        for(int i=0; i<n; i++){

        System.out.print(c[i] + " ");
        }
        
    }
    
}
