class BinarySubarraysWithSum
{
    public static int work(int arr[] , int k)
    {
        int left = 0 ;
        int sum = 0 ;
        int count = 0 ;

        for(int right = 0 ; right < arr.length ; right++)
        {
            sum = sum + arr[right];

            while(sum > k)
            {
                sum = sum - arr[left];

                left++;
            }

            // All subarrays from left to right
            // have sum <= k.
            count = count + right - left + 1;
        }

        return count;
    }

    public static void main(String A[])
    {
        int nums[] = {1,0,1,0,1} ;
        int k = 2 ; 

        int result = work(nums , k) - work(nums , k-1);

        System.out.println(result);
    }
}


/*
--------------------------------------------------------------------
Problem Name : Binary Subarrays With Sum
LeetCode     : #930

Problem:
Given a binary array nums and an integer goal, return the number of
non-empty subarrays whose sum is exactly equal to goal.

Approach:
Use the Sliding Window technique with the transformation:

    Exactly K = AtMost(K) - AtMost(K - 1)

The work() method calculates the number of subarrays whose sum is
at most k.

For every right pointer:
- Add nums[right] to the current window sum.
- If the sum becomes greater than k, move the left pointer forward
  until the window becomes valid.
- For a valid window [left...right], there are
  right - left + 1 subarrays ending at right with sum <= k.

Finally:

    AtMost(goal) - AtMost(goal - 1)

gives the number of subarrays whose sum is exactly goal.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/