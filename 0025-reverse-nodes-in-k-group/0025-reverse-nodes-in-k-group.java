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
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;


        while (true) {

            ListNode last = prev;
            ListNode newend = curr;

            int count = 0;
            ListNode check = curr;

            while(check != null&& count < k){
                check = check.next;
                count++;
            }

            if( count < k ) break;

            for (int i = 0; curr != null && i < k; i++) {
                ListNode futr = curr.next;
                curr.next = prev;
                prev = curr;
                curr = futr;
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newend.next = curr;
            prev = newend;

            if(curr == null){
                break;
            }
        }

        return head;
    }
}