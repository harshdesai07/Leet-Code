
class leetcode2807 {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;

        ListNode prev = head;
        ListNode cur = head.next;

        while(cur != null){
            
            int a = prev.val, b = cur.val;
            // generating GCD
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp; // a becomes the gcd of a and b
            }

            // creating new node 
            ListNode newNode = new ListNode(a, cur);

            prev.next = newNode;
            prev = cur;
            cur = cur.next;
            
        }

        return head;

    }
}