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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode d = new ListNode(-1);
        ListNode cur = d;
        int carry=0;
        while(temp1 !=null || temp2!=null){
            int sum=carry;
            if(temp1!=null) sum+=temp1.val;
            if(temp2!=null) sum+=temp2.val;
            ListNode n = new ListNode(sum%10);
            carry = sum/10;
            cur.next = n;
            cur=cur.next;
            if(temp1!=null) temp1 = temp1.next;
            if(temp2!=null) temp2 = temp2.next;
        }
        if(carry!=0){
            ListNode n = new ListNode(carry);
            cur.next = n;
        }
        return d.next;
    }
}