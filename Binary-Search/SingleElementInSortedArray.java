class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int left = 0 ;
        int right = nums.length - 1 ;
        int mid = 0 ;

        while(left < right)
        {
            mid = left + (right - left ) / 2 ;

            // make mid even 
            if(mid % 2 == 1)
            {
                mid--;
            }

            if(nums[mid] == nums[mid+1])
            {
                left = mid + 2 ;
            }   
            else
            {
                right = mid ;
            }
            
        }

        return nums[left];

    }
}


/* 
-------------------------------------------------------------------- 
Problem Name : Single Element in a Sorted Array
LeetCode     : #540 
 
Problem: 
Given a sorted array where every element appears exactly twice, 
except for one element that appears only once, find the single 
element in O(log n) time and O(1) space. 
 
Approach: 
Use the Binary Search technique to find the single element. 
 
- Initialize left = 0 and right = nums.length - 1.
- Calculate the middle index.
- If mid is odd, decrement it to make it even.
- Compare nums[mid] with nums[mid + 1].
- If both elements are equal, the pair is correct. Move left 
  to mid + 2 because both elements can be skipped.
- Otherwise, the single element is at mid or in the left half. 
  Move right to mid.
- Repeat until left == right.
- Return nums[left], which is the single element.
 
The sorted array's pairing pattern helps eliminate half of the 
remaining search space in each iteration. 
 
Complexity: 
Time  : O(log n) 
Space : O(1) 
-------------------------------------------------------------------- 
*/

