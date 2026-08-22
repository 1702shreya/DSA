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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=dummy;
        int c=0;
        while(temp.next!=null)
        {   c++;
            temp=temp.next;
        }
        temp=dummy;
        int sum=0;
        while(sum!=c-n)
        {   sum++;
            temp=temp.next;

        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}