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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {   
        ListNode dummy = new ListNode(0);
        dummy.next = head ;

        ListNode fast = dummy ;
        ListNode slow = dummy ;

        // move fast n node ahead 
        for(int i = 1 ; i <= n ; i++ )
        {
            fast = fast.next;
        }

        // move both pointer until fast reached at the end of list

        while(fast.next != null)
        {
            fast = fast.next ;
            slow = slow.next;
        }

        // remove the nth node
        slow.next = slow.next.next;

        // we return dummy.next because it stores the head
        return dummy.next ;
    }
}

/*
  LeetCode #19: Remove Nth Node From End of List
 
  Problem:
  Given the head of a singly linked list, remove the nth node
  from the end of the list and return the updated head.
 
  Approach:
  Use two pointers, fast and slow.
  Move fast n steps ahead.
  If fast becomes null, remove the head node.
  Otherwise, move both pointers until fast reaches the last node.
  Remove the node next to slow.
 
  Time Complexity: O(n)
  Space Complexity: O(1)
 */