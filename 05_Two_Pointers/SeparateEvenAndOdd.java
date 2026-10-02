class SeparateEvenAndOdd
{
    public static void main(String A[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int write = 0 , scan = 0 , temp = 0 ;

        while(scan != arr.length)
        {
            if(arr[scan] % 2 == 0)
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
--------------------------------------------------------------------
Problem Name : Separate Even and Odd

Problem:
Given an integer array, rearrange it in-place so that all even
numbers appear before all odd numbers.

The relative order of elements does not matter.

Approach:
Use two pointers: scan and write.

- scan traverses the entire array.
- When an even number is found, swap it with the element at the
  write position.
- Move write forward after placing the even number.
- Continue until all elements are processed.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/