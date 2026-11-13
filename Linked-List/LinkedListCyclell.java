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
    public ListNode detectCycle(ListNode head) 
    {
        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next ;
            slow = slow.next ;

            if(slow == fast)
            {
                slow = head ;

                while(slow != fast)
                {
                    slow = slow.next ;
                    fast = fast.next ;
                }

                return slow ;
            }
           
        }

        return null ;   
    }
}

/*
 Problem Name: 142. Linked List Cycle II

 Problem:
 Given the head of a linked list, return the node where the cycle begins.
 If there is no cycle, return null.

 Approach:
 Use Floyd's Cycle Detection Algorithm (Slow and Fast Pointers).

 Phase 1: Detect the Cycle
 - Initialize slow and fast pointers at the head.
 - Move slow by one step and fast by two steps.
 - If both pointers meet, a cycle exists.
 - If fast reaches null, no cycle exists.

 Phase 2: Find the Starting Node
 - Move slow back to the head.
 - Keep fast at the meeting point.
 - Move both pointers one step at a time.
 - The node where they meet again is the starting node of the cycle.

 Complexity Analysis:
 Time Complexity: O(n)
 Space Complexity: O(1)
*/