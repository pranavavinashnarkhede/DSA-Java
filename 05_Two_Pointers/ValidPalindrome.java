import java.util.*;

class ValidPalindrome
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter string to check palindrome or not : ");
        String str = sobj.nextLine();

        int left = 0 , right = str.length()-1;
        boolean bFlag = true ;

        while(left < right)
        {
            if((str.charAt(left) != str.charAt(right)))
            {
                bFlag = false;
                break;
            }
           
            left++;
            right--;
        
        }
        
        System.out.println(bFlag);
    }

}

/*
--------------------------------------------------------------------
Problem Name : Valid Palindrome

Problem:
Given a string, determine whether it reads the same from left to
right and right to left.

Approach:
Use two pointers, left and right, starting from the beginning and
end of the string.

- Compare the characters at left and right.
- If they are different, the string is not a palindrome.
- If they match, move left forward and right backward.
- Continue until the pointers meet or cross.

This avoids creating a reversed string and checks the palindrome
directly from both ends.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/