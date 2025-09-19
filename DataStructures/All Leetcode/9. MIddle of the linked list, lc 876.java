/**
 * in a linked list,
 *
 *
 *
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
    public ListNode middleNode(ListNode head) {

        ListNode s = head, f = head;
        //only execute as long as f and f.next aren't null
        while(f != null && f.next != null){
            s = s.next; // move forward one step.
            f = f.next.next; // 2 steps
        }

        //completing above while loop means, you've reached the end. and stop moving forward
        return s; //if f is at null, then s is half that, meaning half of the linked list

    }
}
