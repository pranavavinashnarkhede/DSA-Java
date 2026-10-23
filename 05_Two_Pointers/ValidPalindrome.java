class Solution {
    public boolean isPalindrome(String s) 
    {
        int left = 0 ;
        int right = s.length() - 1 ;

        while(left < right)
        {
            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));

            if(!Character.isLetterOrDigit(ch1))
            {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(ch2))
            {
                right--;
                continue;
            }

            if(ch1 != ch2)
            {
                return false;
            }

            left++;
            right--;

        }

        return true ;   
    
    }
}

/*
--------------------------------------------------------------------
Problem Name : Valid Palindrome
LeetCode     : #125

Problem:
Given a string s, determine whether it is a palindrome after
converting all uppercase letters to lowercase and removing all
non-alphanumeric characters.

A palindrome reads the same forward and backward.

Approach:
Use the Two Pointers technique.

- Initialize left at the beginning and right at the end of the string.
- Convert both characters to lowercase before comparison.
- If the left character is not alphanumeric, move left forward.
- If the right character is not alphanumeric, move right backward.
- If both characters are alphanumeric but do not match, return false.
- If they match, move both pointers toward the center.
- If the pointers meet or cross, return true.

Character.isLetterOrDigit() is used to skip spaces, punctuation,
and other non-alphanumeric characters.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/