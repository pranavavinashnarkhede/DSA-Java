class ContainerWithMostWater
{
    public static void main(String A[])
    {
        int heights[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxWater = 0 ;
        int left = 0 , right = 0 ;
        int currentWater = 0 ;

        int width = 0 , height = 0 ;

        right = heights.length-1 ;

        while(left < right)
        {
            height = Math.min(heights[left] , heights[right]);
            width = right - left;

            currentWater = height * width;

            if(currentWater > maxWater)
            {
                maxWater = currentWater;
            }

            if(heights[left] < heights[right])
            {
                left++;
            }
            else 
            {
                right--;
            }
            
        }

        System.out.println(maxWater);
           
    }

}

/*
--------------------------------------------------------------------
Problem Name : Container With Most Water

Problem:
Given an array representing the heights of vertical lines, find
two lines that together with the x-axis form a container that
holds the maximum amount of water.

Input:
[1, 8, 6, 2, 5, 4, 8, 3, 7]

Output:
49

Explanation:
The maximum water is obtained using the lines at indexes 1 and 8.

Height = min(8, 7) = 7
Width  = 8 - 1 = 7

Water = Height * Width
      = 7 * 7
      = 49

Approach:
Use the Two Pointer technique.

Start one pointer from the beginning and another from the end.
Calculate the water between the two lines and move the pointer
having the smaller height.

Complexity:
Time  : O(n)
Space : O(1)

Constraints:
- Use the given array.
- Do not create another array.
- Solve the problem in O(n) time.
- Use O(1) extra space.
--------------------------------------------------------------------

*/