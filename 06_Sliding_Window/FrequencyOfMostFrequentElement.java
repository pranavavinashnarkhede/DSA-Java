import java.util.*;

class FrequencyOfMostFrequentElement
{
    public static void main(String A[])
    {
        int nums[] = {1,2,4};
        int k = 5 ;

        int count = 0 ;
        int left = 0 ;
        int fixed = 0 ;
        long windowSum = 0 ;
        int target = 0 ;

        fixed = nums.length - 1 ;

        for(int right = 0 ; right < nums.length ; right++)
        {
            target = nums[right];
            windowSum = windowSum + target ;

            int windowlen = right - left + 1;
            long cost = target * windowlen - windowSum ;

            while(cost > k)
            {
                windowSum = windowSum - nums[left];
                left++;

                windowlen = right - left + 1 ;
                cost = target * windowlen - windowSum ;
            }

            if(windowlen > count)
            {
                count = windowlen ;
            }
        }

        System.out.println(count);
    }
}

/*
--------------------------------------------------------------------
Problem Name : Frequency of the Most Frequent Element
LeetCode     : #1838

Problem:
Given an integer array nums and an integer k, you can perform at
most k operations. In one operation, you can increment any element
by 1.

Return the maximum possible frequency of an element after performing
at most k operations.

Approach:
Sort the array and use the Sliding Window technique.

- Consider the current element as the target value.
- Use a window containing elements that can be increased to the
  target value.
- Calculate the cost required to make all elements in the window
  equal to the target.
- If the cost exceeds k, shrink the window from the left.
- The largest valid window size is the maximum frequency.

Use a long variable for the window sum because the sum of multiple
array elements can exceed the integer range.

Complexity:
Time  : O(n log n)
Space : O(1) extra space (excluding sorting implementation)
--------------------------------------------------------------------
*/