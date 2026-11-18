class Solution {
    public int commonFactors(int a, int b) 
    {
        int count = 0 ;
        int min = Math.min(a , b);

        for(int i = 1 ; i <= min ; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                count++;
            }
        }

        return count ;    
    }
}


/*
--------------------------------------------------------------------
Problem Name : Number of Common Factors
LeetCode     : #2427

Problem:
Given two positive integers a and b, find the number of common
factors of both numbers.

Approach:
Use Mathematical Division and Modulo Operations to identify
the common factors.

- Initialize count = 0 to store the number of common factors.
- Find the minimum of a and b using Math.min(a, b).
- Traverse all numbers from 1 to min(a, b).
- Check whether both a and b are divisible by the current number.
- Use the modulo (%) operator to check divisibility.
- If a % i == 0 and b % i == 0, increment count.
- Continue until all possible factors are checked.
- Return count as the total number of common factors.

A common factor must divide both numbers completely without
leaving any remainder.

Complexity:
Time  : O(min(a, b))
Space : O(1)

--------------------------------------------------------------------
*/