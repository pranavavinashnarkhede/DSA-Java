class MaxConsecutiveOnesIII
{
    public static void main(String A[])
    {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 0 ;

        int left = 0 ;
        int skipped = 0 ;
        int maxLen = 0 ;

        for(int right = 0 ; right < nums.length ; right++)
        {
            if(nums[right] == 0)
            {
                skipped++;
            }

            while(skipped > k)
            {
                if(nums[left] == 0)
                {
                    skipped--;
                }

                left++;
            }

            if(right - left + 1 > maxLen)
            {
                maxLen = right - left + 1 ;
            }
        }

        System.out.println(maxLen);

    }
}

/*
--------------------------------------------------------------------
Problem Name : Max Consecutive Ones III
LeetCode     : #1004

Problem:
Given a binary array nums and an integer k, you can flip at most
k zeros to ones.

Return the maximum number of consecutive ones obtainable after
performing at most k flips.

Approach:
Use the Sliding Window technique with two pointers.

- Expand the window using the right pointer.
- Count the zeros in the current window using skipped.
- If the number of zeros exceeds k, shrink the window from the
  left until the number of zeros becomes at most k.
- Calculate the current window length and update maxLen.

The window always contains at most k zeros, so every valid window
represents a sequence that can be converted entirely into ones.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/