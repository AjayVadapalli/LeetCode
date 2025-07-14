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
    public int getDecimalValue(ListNode head) {
        int x =0 ;
        int cnt=0;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            cnt++;
        }
        while(temp2 != null){
            cnt--;
            if(temp2.val == 1){
                x+=Math.pow(2,cnt);
            }
            temp2 = temp2.next;
        }
        return x;
    }
}