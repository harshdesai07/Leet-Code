
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1;
        ListNode next = list1;

        for(int i=1; i<=a-1; i++) prev = prev.next;

        for(int i=1; i<=b+1; i++) next = next.next;

        ListNode temp = list2;

        while(temp.next != null) temp = temp.next;

        prev.next = list2;
        temp.next = next;

        return list1;

    }
}