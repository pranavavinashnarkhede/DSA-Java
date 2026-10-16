class LongestSubarrayOf1sAfterDeletingOneElement
{
    public static void main(String A[])
    {
        int nums[] = {1,1,1} ;
        int maxCount = 0 ;
        int deleted = 0 ;
        int left = 0  , right = 0 ;

        for(right = 0 ; right < nums.length ; right++)
        {
            if(nums[right] == 0)
            {
                deleted++;
            }

            // the window always contains atmost one zero
            while(deleted > 1)
            {
                if(nums[left] == 0)
                {
                    deleted--;
                }

                left++;
            }

            int windowLength = right - left + 1 ;

            if(windowLength > maxCount)
            {
                // the problem ask to delete exactly one element 
                maxCount = windowLength - 1 ;
            }

        }
        
        System.out.println(maxCount);
    }
}
/*
--------------------------------------------------------------------
Problem Name : Longest Subarray of 1s After Deleting One Element
LeetCode     : #1493

Problem:
Given a binary array nums, return the maximum number of consecutive
1s that can be obtained by deleting exactly one element.

Approach:
Use the Sliding Window technique with two pointers.

- Expand the window using the right pointer.
- Count the number of zeros in the current window.
- If the window contains more than one zero, shrink it from the
  left until at most one zero remains.
- Calculate the window length and subtract one because exactly
  one element must be deleted.
- Update the maximum length.

The window contains at most one zero, allowing the longest valid
subarray to be found in a single traversal.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/