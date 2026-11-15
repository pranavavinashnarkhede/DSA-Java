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
Problem Name : Reverse Number
LeetCode     : 7

Description:
This folder contains problems related to mathematical operations,
number manipulation, and mathematical problem-solving techniques.

Topics Covered:
- Reverse Integer
- Palindrome Number
- Add Digits
- Plus One
- Square Root Calculation
- Prime Numbers
- GCD and LCM
- Number Properties
- Digit Extraction and Manipulation

Approach:
Practice mathematical problems by applying basic arithmetic
operations, number properties, and mathematical algorithms.

- Understand the mathematical logic behind each problem.
- Use arithmetic operators to manipulate numbers.
- Apply mathematical properties to optimize solutions.
- Handle positive numbers, negative numbers, and zero.
- Consider integer overflow wherever necessary.
- Analyze time and space complexity for each solution.

Purpose:
To improve mathematical problem-solving skills, logical thinking,
and algorithmic efficiency through coding practice.

Language: Java
--------------------------------------------------------------------
*/