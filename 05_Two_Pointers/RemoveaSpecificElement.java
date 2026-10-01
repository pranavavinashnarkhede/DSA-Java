class RemoveaSpecificElement
{
    public static void main(String[] args)
    {
        int arr[] = {3, 2, 2, 3, 4, 2, 5};
        int key = 2;

        int write = 0;
        int scan = 0;

        while(scan < arr.length)
        {
            if(arr[scan] != key)
            {
                arr[write] = arr[scan];
                write++;
            }

            scan++;
        }

        System.out.println("Number of remaining elements : " + write);

        System.out.print("Remaining elements : ");

        for(int i = 0; i < write; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Remove a Specific Element

Problem:
Given an integer array and a target value, remove all occurrences
of the target element in-place while maintaining the relative order
of the remaining elements.

Approach:
Use two pointers: scan and write.

- scan traverses every element in the array.
- If the current element is not the target, copy it to the write
  position and move write forward.
- Target elements are skipped.
- The first 'write' elements contain the remaining valid elements.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/