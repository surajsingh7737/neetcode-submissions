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
    static  ListNode reverse( ListNode head){
       ListNode current=head;
        ListNode previes=null;
        ListNode forword=null;
        while(current!=null){
            forword=current.next;
            current.next=previes;
            previes=current;
            current=forword;
        }
    return previes;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
         ListNode neww=slow.next;
         slow.next=null;
         neww=reverse(neww);
         ListNode i=head;
         ListNode j=neww;
         ListNode dummy =new ListNode(-1);
         ListNode d=dummy;
         while(i!=null && j!=null){
              d.next=i;
              d=d.next;
              i=i.next;
              d.next=j;
              d=d.next;
              j=j.next;
         }
         d.next=i;
         ListNode p=dummy.next;
         while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
         }
    }
}