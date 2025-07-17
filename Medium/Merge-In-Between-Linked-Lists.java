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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list2;
        ListNode cur1 = list1;
        ListNode cur2 = list1;
        while(a!=1){
            cur1 = cur1.next;
            a--;
        }
        while(b!=0){
            cur2 = cur2.next;
            b--;
        }
        cur1.next  = list2;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = cur2.next;
        return list1;
    }
}