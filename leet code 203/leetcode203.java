public class leetcode203 {
    
    // Definition for singly-linked list.
  public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 

    public ListNode removeElements(ListNode head, int val) {
        if(head == null ) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;

        

        while(head != null){
            if(temp.next != null && temp.next.val == val){
                while(head != null && head.val==val){
                    head = head.next;
                }
                temp.next = head;
                temp = temp.next;
                
            }
            else{
                temp = temp.next;
            }
            if(head != null)head = head.next;
        }
        return dummy.next;
    }
}

