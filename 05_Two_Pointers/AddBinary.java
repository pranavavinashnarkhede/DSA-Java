class Solution {
    public String addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1 ;
        int j = b.length() - 1 ;
        int carry = 0 ;

        while(i >= 0 || j >= 0 || carry != 0)
        {
            int sum = carry ;

            if(i >= 0)
            {
                sum = sum + a.charAt(i--) - '0';
            }

            if(j >= 0)
            {
                sum = sum + b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2 ;
        }

        return result.reverse().toString() ;    
    }
}

/*
--------------------------------------------------------------------
Problem Name : Add Binary
LeetCode     : #67

Problem:
Given two binary strings a and b, return their sum as a binary
string.

Approach:
Use Two Pointers and Carry Handling to add the binary strings
from right to left.

- Create a StringBuilder to store the binary result.
- Initialize two pointers i and j at the last positions of
  strings a and b.
- Initialize carry = 0 to store the carry during addition.
- Continue the loop while either pointer has remaining digits
  or carry is not equal to zero.
- Initialize sum with the current carry.
- If i >= 0, convert the current character of a into an integer
  and add it to sum. Move i one position backward.
- If j >= 0, convert the current character of b into an integer
  and add it to sum. Move j one position backward.
- Calculate the result digit using sum % 2.
- Append the result digit to StringBuilder.
- Update carry using sum / 2.
- After processing all digits, reverse the StringBuilder because
  the result digits were stored from right to left.
- Convert StringBuilder into a String and return the result.

Binary Addition Rules:
0 + 0 = 0
0 + 1 = 1
1 + 0 = 1
1 + 1 = 10

Complexity:
Time  : O(max(n, m)), where n and m are the lengths of the
        two binary strings.
Space : O(max(n, m)) for storing the result.

--------------------------------------------------------------------
*/