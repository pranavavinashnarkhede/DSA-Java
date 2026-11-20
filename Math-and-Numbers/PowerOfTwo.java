class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n == 1)
        {
            return true ;
        }

        if(n <= 0 || n % 2 != 0)
        {
            return false ; 
        }

        return isPowerOfTwo(n / 2);
    }
}


/*
--------------------------------------------------------------------
Problem Name : Power of Two
LeetCode     : #231

Problem:
Given an integer n, return true if it is a power of two.
Otherwise, return false.

A power of two can be expressed as 2 raised to the power of
a non-negative integer.

Approach:
Use Recursion and Division to check whether the number is
a power of two.

- Check if n == 1. If yes, return true because 1 = 2^0.
- Check if n <= 0. If yes, return false because powers of
  two are always positive.
- Check if n is odd using n % 2 != 0.
- If n is odd and not equal to 1, return false.
- If n is even, divide n by 2 and recursively call the
  isPowerOfTwo() method.
- Continue dividing until n becomes 1 or fails the conditions.
- Return the final boolean result.

The recursive approach repeatedly divides the number by 2.
A number is a power of two if it can be reduced to 1 through
repeated division by 2.

Complexity:
Time  : O(log n), because the number is divided by 2 in
        every recursive call.
Space : O(log n), due to the recursive call stack.

--------------------------------------------------------------------
*/