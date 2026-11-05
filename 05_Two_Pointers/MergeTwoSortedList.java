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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode first = list1 ;
        ListNode second = list2 ;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy ;

        if(first == null && second == null)
        {
            return dummy.next ;
        }

        while(first != null && second != null)
        {
            if(first.val <= second.val)
            {
                current.next = first ;
                first = first.next ;
                current = current.next ;
            }
            else
            {
                current.next = second ;

                second = second.next ;

                current = current.next ;
            }
        }


        while(first != null)
        {
            current.next = first ;
            first = first.next ;
            current = current.next ;

        }

        while(second != null)
        {
            current.next = second ;
            second = second.next ;
            current = current.next ;
        }

        return dummy.next ;
    }
}

/*
--------------------------------------------------------------------
Problem Name : Merge Two Sorted Lists
LeetCode     : #21

Problem:
Given the heads of two sorted linked lists, merge them into
one sorted linked list and return its head.

Approach:
Use the Two Pointers technique with a Dummy Node to merge
both sorted linked lists.

- Initialize two pointers, first and second, to traverse the
  given linked lists.
- Create a dummy node to maintain the starting point of the
  result linked list.
- Initialize a current pointer to the dummy node.
- Traverse both lists while neither pointer is null.
- Compare the values of the current nodes.
- Attach the smaller value to the result linked list.
- Move the corresponding pointer to its next node.
- Move the current pointer forward after inserting each node.
- When one list becomes empty, attach all remaining nodes
  from the other list.
- Return dummy.next to get the merged sorted linked list.

Since both input linked lists are already sorted, comparing
their current elements allows us to build the merged list
in sorted order.

Complexity:
Time  : O(n + m), where n and m are the lengths of the
        two linked lists.
Space : O(n + m) for the new linked list.

--------------------------------------------------------------------
*/