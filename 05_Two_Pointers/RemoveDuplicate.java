class RemoveDuplicate
{
    public static void main(String[] args)
    {
        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        int write = 0;
        int scan = 1;

        while(scan < arr.length)
        {
            if(arr[write] != arr[scan])
            {
                write++;
                arr[write] = arr[scan];
            }

            scan++;
        }

        System.out.println("Number of unique elements : " + (write + 1));

        System.out.print("Unique elements : ");

        for(int i = 0; i <= write; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Remove Duplicates From Sorted Array

Problem:
Given a sorted integer array, remove duplicate elements in-place
so that every element appears only once.

Approach:
Use two pointers: write and scan.

- scan traverses the array.
- write points to the position of the last unique element.
- When a new unique element is found, move write forward and copy
  the element to that position.
- The unique elements are stored at the beginning of the array.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/