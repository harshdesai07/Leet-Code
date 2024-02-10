
class leetcode725 {
    //  Definition for singly-linked list.
  public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        ListNode temp_head = head;
        int len = 0; // length of list
        int j=0; // index of result array
    

        while(temp_head != null){
            len++;
            temp_head = temp_head.next;
        }

        temp_head = head;

        int n1 = len % k; // number of part which have one extra element from others
        int n2 = len/k; // number of elements to be in one part
        
        // generating n1 parts which will have n2+1 elements each
        for(int i=0; i<n1; i++){
            int idx = 1;
            ListNode temp =  temp_head;

            while(idx<n2+1 && temp != null){
                temp = temp.next;
                idx++;
            }

            result[j] = temp_head;
            j++;

            temp_head = temp.next;
            temp.next = null;
        }

        // if n2>0 means we still have elements which need to be partioned
        if(n2 > 0){
            int n3 = (len - ((n2+1) * n1))/n2;

            for(int i=0; i<n3; i++){
                int idx = 1;
                ListNode temp =  temp_head;

                while(idx<n2 && temp != null){
                    temp = temp.next;
                    idx++;
                }

                result[j] = temp_head;
                j++;

                temp_head = temp.next;
                temp.next = null;
            }
        }

        // if n2==0 means we already put all the elements of list into final result
        // therefore for remaing positions in array we put null value
        else{
            while(j < k){
                result[j] = null;
                j++; 
            }
        }

        return result;
    }
}