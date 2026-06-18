/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
       ArrayList<ListNode> l=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null){
        l.add(temp);
        temp=temp.next;
       }
       int s=l.size()/2;
       
       return l.get(s);
    }
}