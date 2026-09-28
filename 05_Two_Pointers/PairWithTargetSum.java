class PairWithTargetSum
{
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 6, 8, 9, 11};
        int target = 10;

        int first = -1;
        int second = -1;

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];

            if(sum > target)
            {
                right--;
            }
            else if(sum < target)
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
Problem Name : Pair With Target Sum

Problem:
Given a sorted integer array and a target value, find two different
elements whose sum is equal to the target.

Return the indices of the two elements. If no such pair exists,
print -1.

Approach:
Use two pointers, one at the beginning and one at the end.

- If the sum is greater than the target, move the right pointer left.
- If the sum is smaller than the target, move the left pointer right.
- If the sum equals the target, store the indices and stop.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/