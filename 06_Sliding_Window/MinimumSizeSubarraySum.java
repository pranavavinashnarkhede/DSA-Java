class MinimumSizeSubarraySum
{
    public static void main(String A[])
    {
        int nums[] = {2,3,1,2,4,3};
        int target = 7 ;
        int minLength = Integer.MAX_VALUE ;
        int windowSum = 0 ;
        int windowLength = 0 ;
        int left = 0 , right = 0 ;

        for(int right = 0 ; right < nums.length ; right++)
        {
             // Add current element to window
            windowSum = windowSum + nums[right];

            // Shrink window while sum is valid
            while(windowSum >= target)
            {
                // calculate current lenght of the window
                windowLength = right - left + 1 ;

                // Store smaller window length.
                if(windowLength < minLength)
                {
                    minLength = windowLength ;
                }

                // Remove left element
                windowSum = windowSum - nums[left];
                left++;
            }
        }

         // Remove left element
        if(minLength == Integer.MAX_VALUE)
        {
            minLength = 0 ;
        }
        
        System.out.println(minLength);
        
    }
}


/*
Sliding Window — Problem 4

Let's increase the difficulty slightly.

LeetCode 209 — Minimum Size Subarray Sum

Problem

Given an array of positive integers nums and a positive integer target, find the minimal length of a contiguous subarray whose sum is greater than or equal to target.

If no such subarray exists, return 0.

Example 1
Input:
target = 7
nums = [2,3,1,2,4,3]

Valid subarrays include:

[2,3,1,2] → sum = 8 → length 4
[3,1,2,4] → sum = 10 → length 4
[4,3]     → sum = 7 → length 2

Output:

2

Because [4,3] is the shortest valid subarray.

Example 2
target = 4
nums = [1,4,4]

Output:

1

Because [4] already has sum 4.

Example 3
target = 11
nums = [1,1,1,1,1,1,1,1]

Output:

0

No contiguous subarray reaches 11.

Requirements
Subarray must be contiguous
Sum must be ≥ target
Find the minimum length
All array elements are positive
Aim for O(n) time
Extra space should be O(1)
*/