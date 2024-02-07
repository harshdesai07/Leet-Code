public class leetcode2{
    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        // create a dummy node to create ouput
        ListNode dummy = new ListNode(); // initialy it have val=0 and next=null

        // now assign a head pointer to our list
        ListNode head = dummy; //it helps to add more nodes

        while(l1 != null || l2 != null || carry != 0){
            // take the value of first node from both the list
            int num1 = (l1 == null) ? 0: l1.val;
            int num2 = (l2 == null) ? 0: l2.val;

            int sum = num1 + num2 + carry;
            int unitDigit = sum % 10;
            carry = sum/10;

            // insertion of new Node at the start of the list
            ListNode temp = new ListNode(unitDigit);

            head.next = temp;
            head = head.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        ListNode ans = dummy.next;
        dummy.next = null; //break the connection of dummy node with the original ans

        return ans;
    }
}