class MaximumKConsecutiveSumX
{
    public static void main(String A[])
    {
        int nums[] = {2, 1, 5, 1, 3, 2};
        int k = 3 ;
        int windowSum = 0 ;
        int maxSum = 0 ;
        int i = 0 ;

        // calculate sum of first window
        for(i = 0 ; i < k ; i++)
        {
            windowSum = windowSum + nums[i];
        }

        // store first window sum in the maxSum variable
        maxSum = windowSum ;

        // calculate sum of remeaning windows and store the maxSum from it
        for(i = k ; i < nums.length ; i++)
        {
            windowSum = windowSum - nums[i-k] + nums[i];

            if(windowSum > maxSum)
            {
                maxSum = windowSum ;
            }
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
Use the Fixed-Size Sliding Window technique to calculate the
maximum sum efficiently.

- Calculate the sum of the first k elements and store it in
  the windowSum variable.
- Initialize maxSum with the sum of the first window.
- Start traversing the array from index k.
- Remove the element that leaves the window using nums[i-k].
- Add the new element entering the window using nums[i].
- Update windowSum to maintain the sum of the current window.
- If windowSum is greater than maxSum, update maxSum.
- Continue until all possible windows are checked.
- Print maxSum as the final result.

The sliding window avoids recalculating the sum of every window
from scratch by removing the outgoing element and adding the
incoming element.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/