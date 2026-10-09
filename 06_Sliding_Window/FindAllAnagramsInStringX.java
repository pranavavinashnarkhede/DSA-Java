import java.util.*;

class FindAllAnagramsInStringX
{
    public static void main(String A[])
    {
        String s = "cbaebabacd";
        String p = "abc" ;

        char current = '\0';
        int left = 0 ;
        int matchedCharacters = 0 ;

        int required[] = new int[26];
        int window[] = new int[26];

        List <Integer> list  = new ArrayList <> ();

        for(int i = 0 ; i < p.length() ; i++)
        {
            current = p.charAt(i);

            required[current - 'a']++;
        }

        for(int right = 0 ; right < s.length() ; right++)
        {
            current = s.charAt(right);

            window[current -'a']++;

            if(required[current -'a'] != 0 && window[current -'a'] <= required[current - 'a'])
            {
                matchedCharacters++;
            }

            if(right - left + 1 > p.length())
            {
                char ch = s.charAt(left);

                if(required[ch -'a'] != 0 && window[ch -'a'] <= required[ch -'a'])
                {
                    matchedCharacters--;
                }

                window[ch -'a']--;

                left++;
            }

            if(matchedCharacters == p.length())
            {
                list.add(left);
            }
        }

        for(int i = 0 ; i < list.size() ; i++ )
        {
            System.out.print(list.get(i) + "\t");
        }

    }
}

/*
--------------------------------------------------------------------
Problem Name : Find All Anagrams in a String
LeetCode     : #438

Problem:
Given two strings s and p, find all starting indices of substrings
in s that are anagrams of p. Return the indices in any order.

Approach:
Use a fixed-size Sliding Window with two frequency arrays.

- Use the required array to store the frequency of each character
  in p.
- Use the window array to track character frequencies in the
  current window of s.
- Expand the window using the right pointer.
- Track matchedCharacters when a character's frequency in the
  window does not exceed its required frequency.
- Maintain a window size equal to p.length() by removing the
  leftmost character whenever the window becomes too large.
- When matchedCharacters equals p.length(), add the window's
  starting index to the result list.

The frequency arrays allow constant-time character frequency
updates without using HashMaps.

Note:
This implementation assumes that both strings contain only
lowercase English letters ('a' to 'z').

Complexity:
Time  : O(n + m)
Space : O(1) auxiliary space, excluding the result list

Where n is the length of s and m is the length of p.
--------------------------------------------------------------------
*/