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
    public int pairSum(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        ListNode temp = head;
        int z ,max=0;
        while(temp!=null){
            l.add(temp.val);
            temp = temp.next;
        }
        int n = l.size();
        
        for(int i=0;i<n/2;i++){
            z = l.get(i)+l.get(n-i-1);
            max = Math.max(z,max);
        }
        return max;
    }
}