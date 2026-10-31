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
    public ListNode middleNode(ListNode head) 
    {
        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null && fast.next != null )
        {
            fast = fast.next.next ;
            slow = slow.next ;
        }

        return slow ;    
    }
}

/*
--------------------------------------------------------------------
Problem Name : Middle of the Linked List
LeetCode     : #876

Problem:
Given the head of a singly linked list, return the middle node.
If there are two middle nodes, return the second middle node.

Approach:
Use the Slow and Fast Pointer technique.

- Initialize both slow and fast pointers at the head.
- Move slow one step at a time.
- Move fast two steps at a time.
- Continue while fast and fast.next are not null.
- When fast reaches the end, slow will point to the middle node.
- Return slow.

The fast pointer moves twice as quickly as the slow pointer.
Therefore, when fast reaches the end, slow reaches the middle.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/
