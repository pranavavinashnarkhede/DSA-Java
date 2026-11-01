class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int left = 0 , right = nums.length - 1 ; 
        int mid = 0 ;

        while(left <= right)
        {
            mid = left + (right - left) / 2 ;

            if(nums[mid] == target)
            {
                return mid ;
            }
            else if(nums[mid] > target)
            {
                right = mid - 1 ;
            }
            else
            {
                left = mid + 1;
            }
        }

        return left ;    
    }
}


/*
 * Problem Name: 35. Search Insert Position
 
  Problem:
  Given a sorted array of distinct integers and a target value,
  return the index if the target is found. If not, return the index
  where the target should be inserted to maintain the sorted order.
 
  Approach:
  Use Binary Search to find the target efficiently.
  - If nums[mid] == target, return mid.
  - If nums[mid] > target, search the left half.
  - If nums[mid] < target, search the right half.
  - If the target is not found, return left, which represents
    the correct insertion position.
 
  Complexity Analysis:
  Time Complexity: O(log n)
  Space Complexity: O(1)
 */

