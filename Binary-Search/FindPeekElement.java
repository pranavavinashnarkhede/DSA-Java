class Solution {
    public int findPeakElement(int[] nums) 
    {
        int left = 0 ;
        int right = nums.length - 1 ;

        while(left  < right)
        {
            int mid = left + (right - left ) / 2 ;

            if(nums[mid] < nums[mid+1])
            {
                left = mid + 1 ;
            }
            else
            {
                right = mid ;
            }
        }

        return left ;    
    }
}


/*
  Problem Name: 162. Find Peak Element
 
  Problem:
  Given an integer array nums, find a peak element and return its index.
  A peak element is an element that is strictly greater than its neighbors.
  The array may contain multiple peaks, so return the index of any peak.
 
  Approach:
  Use Binary Search to find a peak element efficiently.
  - Calculate the middle index.
  - If nums[mid] < nums[mid + 1], a peak exists in the right half.
    Move left to mid + 1.
  - Otherwise, a peak exists at mid or in the left half.
    Move right to mid.
  - Continue until left == right. This index represents a peak element.
 
  Complexity Analysis:
  Time Complexity: O(log n)
  Space Complexity: O(1)
 */

