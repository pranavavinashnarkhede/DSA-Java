import java.util.*;

class ThreeSum
{
    public static void main(String A[])
    {
        int arr[] = {-4, -1, 0, 1, 2, 5};
        int target = 0 ;
        int sum = 0 ;
        int fixed = 0 , left = 0 , right = 0;
        boolean bFlag = false ;

        for(fixed = 0 ; fixed < arr.length ; fixed++)
        {
            left = fixed+1 ; 
            right = arr.length-1 ;

            while(left < right)
            {
                sum = arr[fixed] + arr[left] + arr[right] ;

                if(sum == target)
                {
                    bFlag = true;
                    break;
                }
                else if(sum > target)
                {
                    right--;
                }
                else 
                {
                    left++;
                }
            }

            if(bFlag)
            {
                break;
            }
        }
        
        if(bFlag)
        {
            System.out.println("The Triplet is : "+arr[fixed] +"\t"+arr[left] + "\t"+arr[right]);
        }
        else
        {
            System.out.println("Triplet does not exists");
        }
        

    }

}

/*
--------------------------------------------------------------------
Problem Name : Three Sum

Problem:
Given a sorted integer array and a target value, find three
different elements whose sum is equal to the target.

Approach:
Fix one element and use two pointers for the remaining portion
of the sorted array.

- Fix an element using the fixed pointer.
- Set left to fixed + 1 and right to the last index.
- Calculate the sum of the three elements.
- If the sum is greater than the target, move right backward.
- If the sum is smaller than the target, move left forward.
- If the sum equals the target, a valid triplet is found.

Complexity:
Time  : O(n²)
Space : O(1)
--------------------------------------------------------------------
*/