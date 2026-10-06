import java.util.*;

class ThreeSumX
{
    public static void main(String A[])
    {
        int nums[] = {-1,0,1,2,-1,-4};
        
        int i = 0 , j = 0 , k = 0 ;
        int sum = 0 ;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<> ();

        for(i = 0 ; i < nums.length ; i++)
        {
            // skipping duplicate elements
            if(i > 0 && nums[i] == nums[i -1])
            {
                continue;
            }

            j = i+1;
            k = nums.length - 1;

            while(j < k)
            {
                sum = nums[i] + nums[j] + nums[k];

                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i] , nums[j] , nums[k]));

                    j++;
                    k--;

                    // skipping duplicate elements
                    while(j < k && nums[j] == nums[j -1])
                    {
                        j++;
                    }

                    // skipping duplicate elements
                    while((j < k && k < nums.length - 1)&& nums[k] == nums[k +1])
                    {
                        k++;
                    }

                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }

        for(List<Integer> triplet : result)
        {
            System.out.println(triplet+"\t");
        }

        
    }

}

/*
--------------------------------------------------------------------
Problem Name : 3Sum
LeetCode     : #15

Problem:
Given an integer array nums, find all unique triplets [nums[i],
nums[j], nums[k]] such that:

    nums[i] + nums[j] + nums[k] = 0

The solution must not contain duplicate triplets.

Approach:
Sort the array and fix one element at a time. Use two pointers,
left and right, to find the remaining two elements whose sum is
equal to the negative of the fixed element.

- Move left forward when the current sum is less than 0.
- Move right backward when the current sum is greater than 0.
- When the sum is 0, store the triplet.
- Skip duplicate values to avoid duplicate triplets.

Complexity:
Time  : O(n²)
Space : O(1) extra space (excluding the sorting implementation)
--------------------------------------------------------------------
*/
