import java.util.*;

public class leetcode649 {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();

        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }

        while(qr.size() > 0 && qd.size() > 0){
            int r = qr.remove(), d = qd.remove();
            
           if (r < d) qr.add(r+n);
           else qd.add(d+n);
        }

        return (qr.size() == 0) ? "Dire" : "Radiant";
    }
}
