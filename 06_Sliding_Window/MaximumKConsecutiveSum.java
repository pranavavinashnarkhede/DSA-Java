class MaximumKConsecutiveSum
{
    public static void main(String A[])
    {
        int nums[] = {2, 1, 5, 1, 3, 2};
        int k = 3 ;
        int windowSum = 0 ;
        int maxSum = 0 ;

        int left = 0 , right = 0 ;

        // loop to calculate sum of first k element and set the right to end of first window position
        while(right < k)
        {
            windowSum = windowSum + nums[right];
            right++;
        }

        left++;

        // store first window sum as max sum
        maxSum = windowSum ;

        // loop to calculate remaining windows sum 
        while(right < nums.length)
        {
            windowSum = windowSum - nums[left-1] + nums[right];

            // update value of maxsum if it is less
            if(windowSum > maxSum)
            {
                maxSum = windowSum;
            }

            left++ ;
            right++ ;

        }

        System.out.println("Maximum Sum = "+maxSum);

    }
}


/*
--------------------------------------------------------------------
Problem Name : Maximum Sum of K Consecutive Elements
Technique    : Sliding Window

Problem:
Given an integer array and an integer k, find the maximum sum
of any contiguous subarray containing exactly k elements.

Approach:
Use the Fixed-Size Sliding Window technique.

- Calculate the sum of the first k elements.
- Initialize maxSum with the first window's sum.
- Move the window one position to the right.
- Subtract the element leaving the window and add the new element
  entering the window.
- Update maxSum whenever the current window sum is greater.
- Repeat until all possible windows have been checked.

The window size remains fixed at k, so each new window can be
calculated efficiently without summing all its elements again.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/

