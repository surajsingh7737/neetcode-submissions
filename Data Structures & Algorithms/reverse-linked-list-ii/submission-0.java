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
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=pre;
            pre=curr;
            curr=fwd;
        }
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1; i<left; i++){
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=tail1.next;
        for(int i=1; i<=right-left+1; i++){
            temp=temp.next;
        }
        ListNode tail2=temp;
        ListNode head3=tail2.next;
        tail1.next=null;
        tail2.next=null;
        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;

        return dummy.next;
    }
}