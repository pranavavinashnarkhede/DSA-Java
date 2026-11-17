class Solution {

    public static int happy(int no)
    {
        int iSum = 0 ;

        while(no > 0)
        {
            int iDigit = no % 10 ;
            iSum = iSum + iDigit * iDigit ;
            no = no / 10 ;
        }
        return iSum ;
    }

    public boolean isHappy(int n) 
    {   
        int slow = n ;
        int fast = n ;

        do
        {
            slow = happy(slow);
            fast = happy(happy(fast));
        }
        while(slow != fast);

        return slow == 1 ;
    }
}   


/*
--------------------------------------------------------------------
Problem Name : Happy Number
LeetCode     : #202

Problem:
A happy number is a number that eventually reaches 1 when
repeatedly replacing the number with the sum of the squares
of its digits.

If the process enters an infinite cycle that does not include 1,
the number is not a happy number.

Approach:
Use Floyd's Cycle Detection Algorithm (Slow and Fast Pointers)
to detect whether the sequence reaches 1 or enters a cycle.

- Create a helper method happy() to calculate the sum of the
  squares of the digits of a given number.
- Initialize two pointers, slow and fast, with the input number.
- Move the slow pointer one step forward by calling happy().
- Move the fast pointer two steps forward by calling happy()
  twice.
- Continue moving both pointers until they meet.
- If both pointers meet at 1, the number is a Happy Number.
- If they meet at any other value, the sequence contains a cycle
  and the number is not a Happy Number.
- Return true if slow == 1; otherwise, return false.

Floyd's Cycle Detection Algorithm identifies cycles without
using an additional HashSet or storing previously visited numbers.

Complexity:
Time  : O(log n) per digit transformation; O(1) overall for
        a 32-bit integer.
Space : O(1), because only two pointers and a few variables
        are used.

--------------------------------------------------------------------
*/