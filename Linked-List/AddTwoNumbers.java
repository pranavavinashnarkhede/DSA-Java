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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode first = l1 ;
        ListNode second = l2 ;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy ;

        int carry = 0 ;

        while(first != null || second != null || carry != 0)
        {
            int digit = 0 ;

            int val1  = (first != null) ? first.val : 0 ;
            int val2  = (second != null) ? second.val : 0 ;

            int temp = val1 + val2 + carry ;

            digit = temp % 10;
            carry = temp / 10;

            current.next = new ListNode(digit);

            current = current.next ;

            if(first != null)
            {
                first = first.next ;
            }

            if(second != null)
            {
                second = second.next ;
            }
           
        }

        return dummy.next ;
    }
}

/*
--------------------------------------------------------------------
Problem Name : Add Two Numbers
LeetCode     : #2

Problem:
Given two non-empty linked lists representing two non-negative
integers, add the numbers and return the result as a linked list.

Each node contains a single digit, and the digits are stored
in reverse order.

Approach:
Use Linked List Traversal with Carry Handling to add the
two numbers digit by digit.

- Initialize two pointers, first and second, to traverse the
  given linked lists.
- Create a dummy node to store the starting point of the
  result linked list.
- Use a current pointer to insert new nodes into the result.
- Initialize carry = 0 to handle carry values during addition.
- Continue the loop while either linked list has nodes remaining
  or carry is not equal to zero.
- Get the values of both nodes. If a node is null, consider
  its value as 0.
- Calculate the sum by adding both node values and the carry.
- Calculate the result digit using sum % 10.
- Calculate the new carry using sum / 10.
- Create a new node with the calculated digit and attach it
  to the result linked list.
- Move the current pointer forward.
- Move the first and second pointers forward if they are not null.
- Return dummy.next to get the actual result linked list.

The dummy node simplifies result linked list creation, while
carry handling allows addition of numbers digit by digit.

Complexity:
Time  : O(max(n, m)), where n and m are the lengths of the
        two linked lists.
Space : O(max(n, m)) for the result linked list.

--------------------------------------------------------------------
*/