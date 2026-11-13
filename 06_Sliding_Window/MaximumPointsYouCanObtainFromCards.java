class MaximumPointsYouCanObtainFromCards
{
    public static void main(String A[])
    {
        int nums[] = {1,2,3,4,5,6,1};
        int k = 3 ;

        int totalCardSum = 0 ;
        int windowSum = 0 ;
        int minWindowSum = Integer.MAX_VALUE ;
        int left = 0 ;
        int requiredWindowSize = nums.length - k ;

        for(int right = 0 ; right < nums.length ; right++)
        {
            totalCardSum = totalCardSum + nums[right];

            windowSum = windowSum + nums[right];

            while(right - left + 1 > requiredWindowSize)
            {
                windowSum = windowSum - nums[left];
                left++;
            }


            if(right - left + 1 == requiredWindowSize)
            {
                minWindowSum = Math.min(windowSum , minWindowSum);
            }
        }

        int result = totalCardSum - minWindowSum ;

        System.out.println(result);
    }
}

/*
--------------------------------------------------------------------
Problem Name : Maximum Points You Can Obtain From Cards

Problem:
Given an array of card points, choose exactly k cards from either
the beginning or the end of the array to maximize the total score.

Approach:
Instead of finding the maximum sum of the selected cards, find the
minimum sum of the cards left behind.

- The number of cards left behind is n - k.
- These cards form a contiguous subarray.
- Use a sliding window of size n - k to find its minimum sum.
- Subtract the minimum window sum from the total array sum.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/