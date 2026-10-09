import java.util.*;

class FindAllAnagramsInString
{
    public static void main(String A[])
    {
        String s = "cbaebabacd";
        String p = "abc" ;

        char current = '\0';
        int left = 0 ;
        int matchedCharacters = 0 ;

        HashMap <Character , Integer> required = new HashMap <> ();
        HashMap <Character , Integer> window = new HashMap <> ();

        List <Integer> list  = new ArrayList <> ();

        for(int i = 0 ; i < p.length() ; i++)
        {
            current = p.charAt(i);

            required.put(current , required.getOrDefault(current , 0)+1);
        }

        for(int right = 0 ; right < s.length() ; right++)
        {
            current = s.charAt(right);

            window.put(current , window.getOrDefault(current , 0) + 1);

            if(required.containsKey(current) && window.get(current) <= required.get(current))
            {
                matchedCharacters++;
            }

            if(right - left + 1 > p.length())
            {
                char ch = s.charAt(left);

                if(required.containsKey(ch) && window.get(ch) <= required.get(ch))
                {
                    matchedCharacters--;
                }

                window.put(ch , window.get(ch) - 1);

                if(window.get(ch) == 0)
                {
                    window.remove(ch);
                }
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
Use the Sliding Window technique with two HashMaps.

- Store the frequency of each character in p in the required map.
- Expand the window by adding characters from s to the window map.
- Track matchedCharacters when a character's frequency does not
  exceed its required frequency.
- Maintain a fixed window size equal to p.length().
- When the window exceeds this size, remove the leftmost character
  and update the matched character count.
- When matchedCharacters equals p.length(), add the window's
  starting index to the result list.

Complexity:
Time  : O(n + m)
Space : O(n + m)

Where n is the length of s and m is the length of p.
--------------------------------------------------------------------
*/