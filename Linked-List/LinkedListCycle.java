/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        ListNode fast = head ;
        ListNode slow = head ;

        if(head == null || head.next == null)
        {
            return false ;
        }

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next ;
            slow = slow.next ;

            if(fast == slow)
            {
                break ;
            }
        }

        return (fast == slow) ? true : false ;    
    }
}


/*
 Problem Name: 141. Linked List Cycle

 Problem:
 Given the head of a linked list, determine whether the linked list
 contains a cycle.
 Return true if a cycle exists; otherwise, return false.

 Approach:
 Use Floyd's Cycle Detection Algorithm (Slow and Fast Pointers).

 - Initialize slow and fast pointers at the head.
 - Move slow by one step at a time.
 - Move fast by two steps at a time.
 - If both pointers meet, a cycle exists.
 - If fast or fast.next becomes null, no cycle exists.

 Complexity Analysis:
 Time Complexity: O(n)
 Space Complexity: O(1)
*/