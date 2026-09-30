class RemoveDuplicatesII
{
    public static void main(String A[])
    {
        int arr[] = {1, 1, 1, 2, 2, 3};
        
        int scan = 0 , write = 0 ;

        while(scan != arr.length)
        {
            if(write < 2 || arr[scan] != arr[write-2])
            {
                arr[write] = arr[scan];
                write++;
            }
            scan++;
        }

        System.out.println("Number of valid elements : " + write);

        System.out.print("Valid elements : ");

        for(int i = 0 ; i < write ; i++)
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
/*
Two Pointers — Problem 15: Remove Duplicates II

You are given a sorted array. Remove extra duplicates in-place so that each element appears at most twice.

Example 1
Input:
arr = {1, 1, 1, 2, 2, 3}

Output:
{1, 1, 2, 2, 3}

Valid element count = 5

The third 1 is removed because 1 is already present twice.

Example 2
Input:
arr = {0, 0, 1, 1, 1, 1, 2, 3, 3}

Output:
{0, 0, 1, 1, 2, 3, 3}

Valid element count = 7
Example 3
Input:
arr = {1, 1, 2, 2, 3, 3}

Output:
{1, 1, 2, 2, 3, 3}

Valid element count = 6
Rules
Array is already sorted.
Modify the same array.
Do not create another array.
Do not use Arrays.sort().
Each value can appear maximum 2 times.
Print only the valid portion of the array.
Return/maintain the count of valid elements.
🎯 Target Complexity
Time:  O(n)
Space: O(1)


*/