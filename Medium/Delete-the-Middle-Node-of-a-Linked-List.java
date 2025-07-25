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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        int n=0;
        while(temp!=null){
            n+=1;
            temp = temp.next;
        }
        if(n==2){
            head.next=null;
            return head;
        }
        if(n==0 || n==1){
            return null;
        }
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(n%2==0){
            slow.next=slow.next.next;
        }else{
            slow.val = slow.next.val;
            slow.next = slow.next.next; 
        }
        return head;
    }
}