class TrappingRainWater
{
    public static void main(String A[])
    {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int maxLeft = 0 , maxRight = 0 , fixed = 0  ;
        int minFromBoth = 0 ;

        int totalWater = 0 ;

        while(fixed < arr.length)
        {
            if(fixed == 0 || fixed == arr.length-1)
            {
                fixed++;
                continue;
            }

            // reset both after every iteration
            maxLeft = 0 ;
            maxRight = 0 ;

            // scanning array to get maximum left element
            for(int i = 0; i < fixed; i++)
            {
                if(arr[i] > maxLeft)
                {
                    maxLeft = arr[i];
                }
            }

            // scanning array to get maximum right element
            for(int i = fixed + 1; i < arr.length; i++)
            {
                if(arr[i] > maxRight)
                {
                    maxRight = arr[i];
                }
            }

            minFromBoth = Math.min(maxLeft , maxRight);

            minFromBoth = Math.min(maxLeft, maxRight);

            // we apply this condition because if minFromBoth is less than arr[fixed] then the answer is produce negative and it gets substract from totalWater and this leads to incorrect answer
            if(minFromBoth > arr[fixed])
            {
                totalWater = totalWater + (minFromBoth - arr[fixed]);
            }

           
            fixed++;
        }

        System.out.println("Total trapped water = "+totalWater);
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
For every index, find the maximum height on its left and the maximum
height on its right.

- Find maxLeft by scanning all elements before the current index.
- Find maxRight by scanning all elements after the current index.
- The possible water level is the minimum of maxLeft and maxRight.
- If this water level is greater than the current bar height, add
  the difference to the total trapped water.
- The first and last bars cannot trap water.

This approach directly calculates the trapped water at every index
using the maximum boundaries on both sides.

Complexity:
Time  : O(n²)
Space : O(1)
--------------------------------------------------------------------
*/