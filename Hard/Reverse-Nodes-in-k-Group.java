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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode next;
        while(temp!=null){
            ListNode kth = findK(temp,k);
            if(kth==null){
                if(prev!=null){
                    prev.next=temp;
                }
                break;
            }
            next = kth.next;
            kth.next=null;
            reverseLinkedList(temp);
            if(temp==head){
               head = kth;
            }else{
                prev.next = kth;
            }
            prev = temp;
            temp = next;
        }
        return head;
    }
    public ListNode findK(ListNode temp , int k){
        k-=1;
        while(temp!=null && k>0){
            temp = temp.next;
            k-=1;
        }
        return temp;
    }
    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}