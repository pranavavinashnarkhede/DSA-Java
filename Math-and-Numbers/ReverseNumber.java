class Solution {
    public int reverse(int x) 
    {
        int temp = x;
        int rev = 0;

        while(temp != 0)
        {
            int digit = temp % 10;

            // Check for positive integer overflow
            if(rev > Integer.MAX_VALUE / 10 ||
              (rev == Integer.MAX_VALUE / 10 && digit > 7))
            {
                return 0;
            }

            // Check for negative integer overflow
            if(rev < Integer.MIN_VALUE / 10 ||
              (rev == Integer.MIN_VALUE / 10 && digit < -8))
            {
                return 0;
            }

            rev = rev * 10 + digit;

            temp = temp / 10;
        }

        return rev;
    }
}


/*
--------------------------------------------------------------------
Problem Name : Reverse Integer
LeetCode     : #7

Problem:
Given a signed 32-bit integer x, reverse its digits and return
the reversed integer.

If reversing the integer causes it to go outside the signed
32-bit integer range, return 0.

Approach:
Use Mathematical Digit Manipulation to reverse the integer
and handle integer overflow.

- Initialize temp = x to preserve the original number.
- Initialize rev = 0 to store the reversed number.
- Traverse the digits of the number while temp != 0.
- Extract the last digit using temp % 10.
- Before updating rev, check for positive integer overflow.
- Check whether rev exceeds Integer.MAX_VALUE / 10.
- If rev equals Integer.MAX_VALUE / 10, ensure digit does
  not exceed 7.
- Check for negative integer overflow using Integer.MIN_VALUE.
- If rev equals Integer.MIN_VALUE / 10, ensure digit is
  not smaller than -8.
- If overflow occurs, return 0.
- Otherwise, update rev using rev * 10 + digit.
- Remove the last digit from temp using temp / 10.
- Continue until all digits are processed.
- Return rev as the reversed integer.

Java automatically preserves the sign during integer division
and remainder operations, so the same logic handles both
positive and negative numbers.

Complexity:
Time  : O(log10 |x|), where x is the input integer.
Space : O(1), because only a constant number of variables
        are used.

--------------------------------------------------------------------
*/