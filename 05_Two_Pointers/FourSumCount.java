class FourSumCount
{
    public static void main(String A[])
    {
        int arr[] = {-2, -1, 0, 0, 1, 2};
        int target = 0 ;

        int totalQuadrupletCount = 0 ;
        int sum = 0 ;
        int left = 0 , right = 0 ;

        for(int first = 0 ; first < arr.length ; first++)
        {
            for(int second  = first+1 ; second  < arr.length ; second ++)
            {
                left = second +1 ;
                right = arr.length-1 ;

                while(left < right)
                {
                    sum = arr[first] + arr[second ] + arr[left] + arr[right];

                    if(sum == target)
                    {
                        totalQuadrupletCount++;
                    }

                    if(sum > target)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
            }
        }

        System.out.println("Total Quadruplets : " + totalQuadrupletCount);
        
        
    }
}

/*
--------------------------------------------------------------------
Problem Name : 4Sum Count

Problem:
Given a sorted array of integers and a target value, count the
number of quadruplets whose sum is equal to the target.

Each quadruplet must contain four different indices.

Approach:
Fix the first two elements using nested loops and use two pointers
for the remaining two elements.

- If sum > target, move the right pointer backward.
- If sum < target, move the left pointer forward.
- If sum == target, increment the quadruplet count.

Complexity:
Time  : O(n^3)
Space : O(1)
--------------------------------------------------------------------
*/