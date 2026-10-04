class ThreeSumClosest
{
    public static void main(String[] args)
    {
        int arr[] = {-4, -1, 1, 2, 5};
        int target = 3;

        int smallestDifference = Integer.MAX_VALUE;
        int finalSum = 0;

        for(int fixed = 0; fixed < arr.length - 2; fixed++)
        {
            int left = fixed + 1;
            int right = arr.length - 1;

            while(left < right)
            {
                int sum = arr[fixed] + arr[left] + arr[right];
                int difference = Math.abs(target - sum);

                if(difference < smallestDifference)
                {
                    smallestDifference = difference;
                    finalSum = sum;
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

        System.out.println("Closest Sum : " + finalSum);
    }
}

/*
--------------------------------------------------------------------
Problem Name : Three Sum Closest

Problem:
Given a sorted integer array and a target value, find three different
elements whose sum is closest to the target.

Approach:
Fix one element and use two pointers for the remaining elements.

- Calculate the sum of the three elements.
- Calculate the absolute difference between the sum and target.
- Update the closest sum whenever a smaller difference is found.
- If the sum is greater than the target, move right backward.
- Otherwise, move left forward.
- Continue for every possible fixed element.

Complexity:
Time  : O(n²)
Space : O(1)
--------------------------------------------------------------------
*/