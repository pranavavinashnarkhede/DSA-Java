class PairWithDifference
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int difference = 4;

        int left = 0;
        int right = arr.length - 1;

        int first = -1;
        int second = -1;

        while(left < right)
        {
            int currentDifference = arr[right] - arr[left];

            if(currentDifference > difference)
            {
                right--;
            }
            else if(currentDifference < difference)
            {
                left++;
            }
            else
            {
                first = left;
                second = right;
                break;
            }
        }

        if(first != -1)
        {
            System.out.println("Index 1 : " + first);
            System.out.println("Index 2 : " + second);
        }
        else
        {
            System.out.println("-1");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Pair With Difference

Problem:
Given a sorted integer array, find a pair of different elements
whose difference is exactly equal to the given value.

Return the indices of the pair where the first index comes before
the second index.

Approach:
Use two pointers, left and right.

- If the current difference is greater than the target, move right
  backward.
- If the current difference is smaller than the target, move left
  forward.
- If the difference matches the target, store the indices and stop.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/