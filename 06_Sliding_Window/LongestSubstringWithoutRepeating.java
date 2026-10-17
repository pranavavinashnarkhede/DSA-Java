import java.util.*;

class LongestSubstringWithoutRepeating
{
    public static void main(String A[])
    {
        String s = "pwwkew";
        int left = 0 ;
        int maxLength = 0 ;

        HashSet <Character> set = new HashSet<> ();

        for(int right = 0 ; right < s.length() ; right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            int windowLength = right - left + 1 ;

            if(windowLength > maxLength)
            {
                maxLength = windowLength ;
            }
        }

        System.out.println(maxLength);
        
    }
}
/*
--------------------------------------------------------------------
Problem Name : Longest Substring Without Repeating Characters
LeetCode     : #3

Problem:
Given a string s, find the length of the longest contiguous
substring that contains no repeating characters.

Approach:
Use the Sliding Window technique with two pointers and a HashSet.

- Expand the window using the right pointer.
- If the current character already exists in the set, shrink the
  window from the left and remove characters until the duplicate
  is eliminated.
- Add the current character to the set.
- Calculate the current window length and update maxLength.

The HashSet stores unique characters in the current window.

Complexity:
Time  : O(n)
Space : O(min(n, charset))

Where n is the length of the string and charset is the character
set supported by the input.
--------------------------------------------------------------------
*/