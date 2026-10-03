import java.util.*;

class SquaresOfASortedArray
{
    public static void main(String A[])
    {
        int arr[] = {-7, -3, -1, 2, 4, 6};
        int left = 0 , right = arr.length - 1 ;
        int temp = 0 ;

        int result[] = new int[arr.length];
        int index = result.length-1 ;

        int leftAbs = 0 ;
        int rightAbs = 0 ;

        while(left <= right)
        {
            leftAbs = Math.abs(arr[left]);
            rightAbs = Math.abs(arr[right]);

            temp = Math.max(leftAbs , rightAbs);
            temp = (temp) * (temp) ;

            result[index] = temp;
            index--;
    
            if(leftAbs > rightAbs)
            {
                left++;
            }
            else
            {
                right--;
            }
        
        }

        for(Integer no : result)
        {
            System.out.print(no+"\t");
        }
    }

}
/*
--------------------------------------------------------------------
Problem Name : Squares of a Sorted Array

Problem:
Given a sorted integer array containing negative and positive
values, create a new array containing the squares of all elements
in sorted order.

Approach:
Use two pointers at the beginning and end of the sorted array.

- Compare the absolute values at both pointers.
- The larger absolute value produces the largest square.
- Place that square at the current position from the end of the
  result array.
- Move the pointer whose absolute value was selected.
- Continue until all elements are processed.

Complexity:
Time  : O(n)
Space : O(n)
--------------------------------------------------------------------
*/