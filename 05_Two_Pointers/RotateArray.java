class RotateArray
{
    public static void main(String A[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3 ;

        k = k % arr.length ;

        int left = 0 ; 
        int right = 0 ;

        int temp = 0 ;

        right = arr.length-1-k;

        // reversing first section
        while(left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left++;
            right--;
        }

        left = arr.length - k ;
        right = arr.length - 1 ;

        // reversing second section
        while(left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left++;
            right--;
        }

        // reversing the complete array

        left = 0 ;
        right = arr.length-1 ;
        
        while(left < right)
        {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;

            left++;
            right--;
        }        

        for(Integer no : arr)
        {
            System.out.print(no+"\t");
        }
 
    }
}

/*
--------------------------------------------------------------------
Problem Name : Rotate Array

Problem:
Given an array, rotate it to the right by k positions in-place.

Approach:
Use the three-reversal technique.

1. Reverse the first n-k elements.
2. Reverse the last k elements.
3. Reverse the entire array.

Before rotating, reduce k using k % n so that k never exceeds the
array length.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/