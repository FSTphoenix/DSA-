class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(count == n){
            return head.next;
        }

        count = count - n;

        ListNode curr = head;
        ListNode prv = null;

        for(int i = 0; i < count; i++){
            prv = curr;
            curr = curr.next;
        }

        prv.next = curr.next;

        return head;
    }
}