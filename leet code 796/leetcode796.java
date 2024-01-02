public class leetcode796 {
    //Function Definition
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        return((s+s).indexOf(goal)>=0);
    }

    public static void main(String[] args) {
        String s = "ABCD";
        String t = "DCBA";

        //Function Calling
        boolean ans = rotateString(s, t);

        System.out.println(ans);

    }
}
    

