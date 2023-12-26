import java.util.*;
public class solution{
    //Function Definition
    public static int minOperations(String s) {
        int countForAlternate0 = 0;
        int countForAlternate1 = 0;
    for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 0) {
            if (s.charAt(i) == '0') {
                countForAlternate1++;
            } else {
                countForAlternate0++;
            }
        } else {
            if (s.charAt(i) == '1') {
                countForAlternate1++;
            } else {
                countForAlternate0++;
            }
        }
    }
    return Math.min(countForAlternate0, countForAlternate1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string with 0 and 1 only: ");
        String s = sc.next();

        //Function calling
        int ans = minOperations(s);

        System.out.println("The minimum number of operation is: "+ ans);
        
    }
}