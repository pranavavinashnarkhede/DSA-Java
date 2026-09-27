class MoveNegativesLeft
{
    public static void main(String A[])
    {
        int arr[] = {3, -2, 5, -7, 8, -1};

        int write = 0 , scan = 0 , temp = 0 ;

        while(scan != arr.length)
        {
            if(arr[scan] < 0)
            {
                temp = arr[scan];
                arr[scan] = arr[write];
                arr[write] = temp ;

                write++;
                scan++;
            }
            else 
            {
                scan++;
            }
        }

        for(Integer no : arr)
        {
            System.out.print(no+"\t");
        }

    }
}

/*
Two Pointers — Problem 18: Move Negative Numbers to the Left

Given an integer array, rearrange it in-place so that:

All negative numbers come before all non-negative numbers.
Relative order does not matter.
Modify the same array.
Do not create another array.
Do not use sorting.
Example 1
Input:
{3, -2, 5, -7, 8, -1}

Valid output:
{-1, -2, -7, 3, 8, 5}

Any arrangement where all negatives are before all non-negatives is valid.

Example 2
Input:
{-5, 2, -1, 4, -3, 6}

Valid output:
{-5, -1, -3, 2, 4, 6}
Rules
Modify the original array.
No extra array.
No Arrays.sort().
Relative order doesn't matter.
🎯 Target
Time:  O(n)

*/