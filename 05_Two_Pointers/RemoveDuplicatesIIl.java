class RemoveDuplicatesIII
{
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2,
                     3, 3, 3, 3, 4, 4, 4, 4, 6, 6};

        int scan = 0;
        int write = 0;

        while(scan < arr.length)
        {
            if(write < 3 || arr[scan] != arr[write - 3])
            {
                arr[write] = arr[scan];
                write++;
            }

            scan++;
        }

        System.out.println("Number of valid elements : " + write);

        System.out.print("Valid elements : ");

        for(int i = 0; i < write; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Remove Duplicates III

Problem:
Given a sorted array, remove extra duplicates in-place so that each
element appears at most three times.

Approach:
Use two pointers: scan and write.

- scan traverses the array.
- write represents the position where the next valid element
  should be placed.
- Allow the first three occurrences of every value.
- For subsequent occurrences, compare the current element with
  arr[write - 3].
- If they are different, the current element can be included.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/