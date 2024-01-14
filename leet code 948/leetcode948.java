import java.util.*;

public class leetcode948 {
    // Function Definition
    public static int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;

        Arrays.sort(tokens);

        int i=0, j=n-1, score=0;
        while(i<=j){
            // increase score and decrease power
            if(tokens[i] <= power){
                power-=tokens[i];
                i++;
                score++;
            }
            // increase power and decrease score
            else if(score>0 && i!=j){
                power+=tokens[j];
                score--;
                j--;
            }
            // don't touch the element
            else{
                break;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        int arr[] = {100,200,400,300,500};
        int power = 150;

        // Function Calling
        System.out.println(bagOfTokensScore(arr,power));
    }
}
