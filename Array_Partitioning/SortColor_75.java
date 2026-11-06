class Solution {
    public void sortColors(int[] nums) 
    {
        int low = 0 , mid = 0 ;
        int high = nums.length - 1 ;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                nums[mid] = nums[low];
                nums[low] = 0 ;

                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                nums[mid] = nums[high];
                nums[high] = 2 ;

                high--;
            }
        }    
    }
}

/*
--------------------------------------------------------------------
Problem Name : Sort Colors
LeetCode     : #75

Problem:
Given an array containing only 0, 1, and 2, sort the array
in-place so that elements of the same color are grouped together
in the order 0, 1, and 2.

Approach:
Use the Dutch National Flag Algorithm with three pointers:
low, mid, and high.

- Initialize low = 0, mid = 0, and high = nums.length - 1.
- Traverse the array while mid <= high.
- If nums[mid] == 0:
  Swap nums[mid] with nums[low].
  Increment both low and mid.
- If nums[mid] == 1:
  Move mid forward because 1 is already in the correct region.
- If nums[mid] == 2:
  Swap nums[mid] with nums[high].
  Decrement high without incrementing mid because the swapped
  element needs to be examined.
- Continue until mid crosses high.

The algorithm sorts the array in a single traversal without
using any additional array.

Complexity:
Time  : O(n)
Space : O(1)

--------------------------------------------------------------------
*/