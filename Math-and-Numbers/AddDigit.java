class Solution {
    public int addDigits(int num) 
    {
        int sum = 0 ;

        while(num != 0)
        {
            sum = sum + num % 10 ;
            num = num / 10 ;

            if(num == 0)
            {
                if(sum <= 9)
                {
                    return sum ;
                }
                else
                {
                    num = sum ;
                    sum = 0 ;
                }
            }
        }

        return sum ;    
    }
}

/*
--------------------------------------------------------------------
Problem Name : Add Digits
LeetCode     : #258

Problem:
Given an integer num, repeatedly add all its digits until the
result has only one digit, and return that single-digit result.

Approach:
Use Iterative Digit Manipulation to calculate the sum of digits
until a single-digit number is obtained.

- Initialize sum = 0 to store the sum of individual digits.
- Run a while loop until num becomes 0.
- Extract the last digit using num % 10.
- Add the extracted digit to sum.
- Remove the last digit using num / 10.
- When num becomes 0, check whether sum is a single-digit number.
- If sum <= 9, return sum as the final answer.
- Otherwise, assign sum to num and reset sum = 0.
- Repeat the process until a single-digit result is obtained.
- Return the final sum.

The algorithm repeatedly extracts and adds digits until the
number is reduced to a single digit.

Complexity:
Time  : O(log n) for each digit-summing pass. Overall, O(log n)
        for a fixed-width integer.
Space : O(1), because only a constant number of variables
        are used.

--------------------------------------------------------------------
*/