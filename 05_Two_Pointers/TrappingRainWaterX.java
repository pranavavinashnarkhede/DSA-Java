class TrappingRainWaterX
{
    public static void main(String A[])
    {
        int arr[] = {4, 2, 0, 3, 2, 5};

        int maxLeft = 0;
        int maxRight = 0;

        int left = 0;
        int right = arr.length - 1;

        int totalWater = 0;

        /*
         * Compare the bars at both ends.
         * The smaller boundary limits the water level,
         * so we process the side having the smaller height.
         */
        while(left < right)
        {
            // Left side is the limiting boundary.
            if(arr[left] <= arr[right])
            {
                /*
                 * If current bar is the highest seen from the left,
                 * update maxLeft. No water can be stored here.
                 */
                if(arr[left] >= maxLeft)
                {
                    maxLeft = arr[left];
                }
                else
                {
                    /*
                     * Current bar is lower than maxLeft,
                     * so the difference represents trapped water.
                     */
                    totalWater = totalWater + (maxLeft - arr[left]);
                }

                // Move the left pointer inward.
                left++;
            }
            else
            {
                // Right side is the limiting boundary.
                if(arr[right] >= maxRight)
                {
                    /*
                     * If current bar is the highest seen from the right,
                     * update maxRight. No water can be stored here.
                     */
                    maxRight = arr[right];
                }
                else
                {
                    /*
                     * Current bar is lower than maxRight,
                     * so the difference represents trapped water.
                     */
                    totalWater = totalWater + (maxRight - arr[right]);
                }

                // Move the right pointer inward.
                right--;
            }
        }

        System.out.println("Total trapped water = " + totalWater);
    }
}

/*
--------------------------------------------------------------------
Problem Name : Trapping Rain Water

Problem:
Given an integer array where each element represents the height of
a bar, calculate the total amount of water that can be trapped
between the bars after rainfall.

Approach:
Use two pointers, left and right, along with maxLeft and maxRight.

- Compare the heights at the two ends.
- Process the side with the smaller boundary because it determines
  the maximum possible water level for that side.
- If the current bar is higher than the maximum boundary seen so far,
  update maxLeft or maxRight.
- Otherwise, the difference between the boundary and current bar
  represents trapped water.
- Move the corresponding pointer inward and continue until the
  pointers meet.

This avoids repeatedly scanning the left and right sides for every
element.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/