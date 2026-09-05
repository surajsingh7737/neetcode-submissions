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
     static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        ListNode forw=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forw;
        }
        return pre;
    }
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode node2=slow.next;
        slow.next=null;
        node2=reverse(node2);
        ListNode i=head;
        ListNode j=node2;
        int pre=Integer.MIN_VALUE;;
        int sum=0;
        while(j!=null){
            sum=i.val+j.val;
            if(sum>pre) pre=sum;
            i=i.next;
            j=j.next;
        }
        return pre;
    }
}