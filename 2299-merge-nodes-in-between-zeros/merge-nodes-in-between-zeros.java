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
    public ListNode mergeNodes(ListNode head) {
        ListNode n=new ListNode(0);
        ListNode cp=n;
        ListNode temp=head.next;
        int c=0;
        while(temp!=null)
        {
            if(temp.val!=0)
            {
                c+=temp.val;
            }
            else
            {
               cp.next=new ListNode(c);
               cp=cp.next;
               c=0;
            }
            temp=temp.next;
        }
        return n.next;
    }
}