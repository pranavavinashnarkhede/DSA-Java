class CountNumberOfNiceSubarrays
{
    public static int work(int arr[] , int k)
    {
        int count = 0 ;
        int left = 0 ;
        int arrCount = 0 ;

        for(int right = 0 ; right < arr.length ; right++)
        {
            if(arr[right] % 2 != 0)
            {
                count++;
            }

            while(count > k && left <= right)
            {
                if(arr[left] % 2 != 0)
                {
                    count--;
                }

                left++;
            }

            arrCount = arrCount + right - left + 1 ;

        }

        return arrCount;
    }

    public static void main(String A[])
    {
        int nums[] = {1,1,2,1,1};
        int k = 3 ;

        int result = work(nums , k) - work(nums , k-1);

        System.out.println(result);
    }
}

/*
--------------------------------------------------------------------
Problem Name : Count Number of Nice Subarrays
LeetCode     : #1248

Problem:
Given an array of positive integers nums and an integer k, return
the number of non-empty subarrays containing exactly k odd numbers.

Approach:
Use the Sliding Window technique with the transformation:

    Exactly K = AtMost(K) - AtMost(K - 1)

The work() method counts the number of subarrays containing at most
k odd numbers.

- Increment count when the current element is odd.
- If the window contains more than k odd numbers, move the left
  pointer forward until the window becomes valid.
- For every valid window [left...right], there are
  right - left + 1 valid subarrays ending at right.

Finally:

    AtMost(k) - AtMost(k - 1)

gives the number of subarrays containing exactly k odd numbers.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/