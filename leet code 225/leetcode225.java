import java.util.*;

public class leetcode225 {
    class MyStack {
        Queue<Integer> q = new LinkedList<>();
        public MyStack() {
            
        }
        
        public void push(int x) {
            q.add(x);
        }
        
        public int pop() {
            for(int i=0; i<q.size()-1; i++){
                q.add(q.remove());
            }
    
            int n = q.remove();
    
            return n;
        }
        
        public int top() {
            for(int i=0; i<q.size()-1; i++){
                q.add(q.remove());
            }
    
            int n = q.peek();
            q.add(q.remove());
    
            return n;
        }
        
        public boolean empty() {
            if(q.size() == 0) return true;
    
            return false;
        }
    }
}
