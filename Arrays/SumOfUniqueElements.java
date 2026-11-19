class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int result[] = new int[101];

        for(int i = 0 ; i < nums.length ; i++)
        {
            result[nums[i]]++;
        }

        int sum = 0 ;

        for(int j = 0 ; j < result.length ; j++)
        {
            if(result[j] == 1)
            {
                sum = sum + j ;
            }
        }

        return sum ;
    }
}


/*
--------------------------------------------------------------------
Problem Name : Sum of Unique Elements
LeetCode     : #1748

Problem:
Given an integer array nums, return the sum of all elements
that appear exactly once in the array.

Approach:
Use Frequency Counting with an Array to identify unique elements.

- Create an integer array of size 101 to store the frequency
  of each element.
- Traverse the input array.
- Increment the frequency of each element using result[nums[i]]++.
- Initialize sum = 0 to store the sum of unique elements.
- Traverse the frequency array.
- Check whether the frequency of an element is exactly 1.
- If the frequency is 1, add its index to sum.
- Continue until all elements are checked.
- Return sum as the final result.

The frequency array stores the occurrence count of each number.
An element is considered unique if it appears exactly once.

Complexity:
Time  : O(n + 101), where n is the length of the input array.
Space : O(101) for the frequency array, which is O(1) because
        its size is fixed.

--------------------------------------------------------------------
*/