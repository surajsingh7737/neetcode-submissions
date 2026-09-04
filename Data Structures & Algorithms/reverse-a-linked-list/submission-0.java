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
    public ListNode reverseList(ListNode head) {
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
}
