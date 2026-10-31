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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode temp = head ;

        while(temp != null && temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
                temp.next = temp.next.next ;
            }
            else 
            {
                temp = temp.next ;
            }
        }

        return head ;    
    }
}


/*
--------------------------------------------------------------------
Problem Name : Remove Duplicates from Sorted List
LeetCode     : #83

Problem:
Given the head of a sorted linked list, remove duplicate elements
so that each element appears only once and return the updated list.

Approach:
Use a single pointer to traverse the linked list.

- Initialize temp at the head of the linked list.
- Traverse while temp and temp.next are not null.
- If temp.val equals temp.next.val, skip the duplicate node
  by updating temp.next to temp.next.next.
- Otherwise, move temp to the next node.
- Return head after removing all duplicates.

Since the list is sorted, duplicate elements appear consecutively.
Therefore, we only need to compare adjacent nodes.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/

