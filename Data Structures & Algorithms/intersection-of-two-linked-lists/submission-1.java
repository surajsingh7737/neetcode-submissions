/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int len1=0, len2=0;
        ListNode temp1=headA;
        while(temp1!=null){
            temp1=temp1.next;
            len1++;
        }
        ListNode temp2=headB;
        while(temp2!=null){
            temp2=temp2.next;
            len2++;
        }
         temp1=headA;
         temp2=headB;
        if(len1>len2){
           while(len1!=len2){
                temp1=temp1.next;
                len1--;
            }
            }else{
                while(len2!=len1){
                temp2=temp2.next;
                len2--;
            }
        }

        while(temp1!=temp2){
            temp2=temp2.next;
            temp1=temp1.next;
        }
       
        return temp1;
    }
}