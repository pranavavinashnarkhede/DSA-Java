class MaximumAverageSubarray
{
    public static void main(String A[])
    {
        int nums[] = {1,12,-5,-6,50,3};
        int k = 4 ;
        int i = 0 ;
        int windowSum = 0 ;
        int maxSum = 0 ;
        double maxAvg = 0.0;

        // calculate sum of first window
        for(i = 0 ; i < k ; i++)
        {
            windowSum = windowSum + nums[i];
        }

        // initially maxSum is sum of first window
        maxSum = windowSum ;

        // calculate sum of remeaning windows and store maxSum
        for(i = k ; i < nums.length ; i++)
        {
            windowSum = (windowSum - nums[i - k] )+ nums[i];

            if(windowSum > maxSum)
            {
                maxSum = windowSum ;
            }
        }

        // we need typecasting because we are performing division of int , int so java will give result in
        maxAvg = (double)maxSum / k ;   

        System.out.println("Maximum average :"+maxAvg);
        
    }
}


/*
--------------------------------------------------------------------
Problem Name : Maximum Average Subarray I
LeetCode     : #643

Problem:
Given an integer array nums and an integer k, find the contiguous
subarray of exactly k elements that has the maximum average.

Return the maximum average value.

Approach:
Use the Fixed-Size Sliding Window technique.

- Calculate the sum of the first k elements.
- Initialize maxSum with the sum of the first window.
- Slide the window through the array by removing the leftmost
  element and adding the next element.
- Update maxSum whenever the current window sum is greater.
- Calculate the maximum average by dividing maxSum by k.
- Use typecasting to double to avoid integer division.

The window size remains exactly k throughout the traversal.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/