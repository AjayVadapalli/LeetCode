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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        ListNode front = head.next;
        while(front !=null){
            int x = gcd(cur.val,front.val);
            ListNode n = new ListNode(x);
            cur.next = n;
            n.next = front;
            cur = front;
            front = front.next;
        }
        return head;
    }
    public int gcd(int x , int y){
        if(y==0){
            return x;
        }
        return gcd(y , x%y);
    }
}