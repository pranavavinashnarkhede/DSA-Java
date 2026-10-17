import java.util.*;

class LongestSubstringAtMostTwoDistinctCharacters
{
    public static void main(String A[])
    {
        String s = "ccaabbb" ;

        int left = 0 ;
        int unique = 0 ;
        int maxLen = 0 ;
        char ch = '\0';    

        HashMap <Character , Integer> map = new HashMap <> ();

        for(int right = 0 ; right < s.length() ; right++)
        {
            ch = s.charAt(right);

            if(!map.containsKey(ch))
            {
                unique++;
            }

            map.put(ch , map.getOrDefault(ch , 0)+ 1);

            while(unique > 2)
            {
                ch = s.charAt(left);

                map.put(ch , map.getOrDefault(ch , 0) - 1);

                if(map.get(ch) == 0)
                {
                    map.remove(ch);
                    unique--;
                }

                left++;
            }

            if(right - left + 1 > maxLen)
            {
                maxLen = right - left + 1 ;
            }
        }

        System.out.println(maxLen);
    }
}
/*
--------------------------------------------------------------------
Problem Name : Longest Substring with At Most Two Distinct Characters
LeetCode     : #159

Problem:
Given a string s, find the length of the longest contiguous
substring containing at most two distinct characters.

Approach:
Use the Sliding Window technique with two pointers and a HashMap.

- Expand the window using the right pointer.
- Store the frequency of each character in the HashMap.
- Track the number of distinct characters in the window.
- If the window contains more than two distinct characters, shrink
  it from the left until at most two remain.
- Remove a character from the map when its frequency becomes zero.
- Update maxLen with the maximum valid window length.

Complexity:
Time  : O(n)
Space : O(1) for the fixed character set; O(k) in general, where
        k is the number of distinct characters in the window.
--------------------------------------------------------------------
*/