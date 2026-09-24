class IntersectionSortedArrays
{
    public static void main(String A[])
    {
        int arr1[] = {1, 2, 3, 4, 6};
        int arr2[] = {2, 4, 6, 8};

        int result[] = new int[Math.min(arr1.length, arr2.length)];

        int arr1_index = 0;
        int arr2_index = 0;
        int result_index = 0;

        while(arr1_index < arr1.length && arr2_index < arr2.length)
        {
            if(arr1[arr1_index] == arr2[arr2_index])
            {
                result[result_index] = arr1[arr1_index];

                result_index++;
                arr1_index++;
                arr2_index++;
            }
            else if(arr1[arr1_index] < arr2[arr2_index])
            {
                arr1_index++;
            }
            else
            {
                arr2_index++;
            }
        }

        for(int i = 0; i < result_index; i++)
        {
            System.out.print(result[i] + "\t");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Intersection of Two Sorted Arrays

Problem:
Given two sorted arrays, find the elements that are present in
both arrays. Preserve duplicate occurrences based on their
frequency in both arrays.

Approach:
Use two pointers, one for each array.

- If both elements are equal, add the element to the result and
  move both pointers.
- If the first element is smaller, move the first pointer.
- Otherwise, move the second pointer.

Complexity:
Time  : O(n + m)
Space : O(min(n, m))
--------------------------------------------------------------------
*/