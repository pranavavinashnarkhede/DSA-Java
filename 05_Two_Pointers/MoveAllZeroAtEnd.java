class MoveAllZeroAtEnd
{
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 0, 3, 12};

        int current = 0;
        int move = 1;

        while(move < arr.length)
        {
            if(arr[current] == 0 && arr[move] != 0)
            {
                arr[current] = arr[move];
                arr[move] = 0;

                current++;
                move++;
            }
            else if(arr[current] == 0 && arr[move] == 0)
            {
                move++;
            }
            else
            {
                current++;
                move++;
            }
        }

        for(int no : arr)
        {
            System.out.print(no + "\t");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Move All Zeros to the End

Problem:
Given an integer array, move all zeros to the end while maintaining
the relative order of the non-zero elements.

Approach:
Use two pointers to identify a zero position and the next non-zero
element.

- Keep current at the position where the next non-zero element
  should be placed.
- Move the second pointer forward to find a non-zero element.
- Swap the zero with the non-zero element.
- Continue until the array is processed.

The array is modified in-place without using an extra array.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/