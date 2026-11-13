import java.util.*;

class MinimumWindowSubstring
{
    public static void main(String A[])
    {
        String source = "ADOBECODEBAC" ;
        String target = "ABC";
        int currentWindowLength = 0 ;
        int minimumWindowLength = Integer.MAX_VALUE ;
        int windowStart = 0 , windowEnd = 0 ;
        int matchedCharacters = 0 ;
        char currentCharacter = '\0';
        int minimumWindowStart = 0;

        HashMap <Character , Integer> windowFrequency = new HashMap <> ();
        HashMap <Character , Integer> requiredFrequency = new HashMap <> ();

        for(int i = 0; i < target.length(); i++)
        {
            currentCharacter = target.charAt(i);

            requiredFrequency.put(currentCharacter, requiredFrequency.getOrDefault(currentCharacter, 0) + 1);
        }

        for(windowEnd = 0 ; windowEnd < source.length(); windowEnd++)
        {
            currentCharacter = source.charAt(windowEnd);

            windowFrequency.put(currentCharacter , windowFrequency.getOrDefault(currentCharacter , 0) + 1);

            if(requiredFrequency.containsKey(currentCharacter) && windowFrequency.get(currentCharacter) <= requiredFrequency.get(currentCharacter))
            {
                matchedCharacters++;
            }

            while(matchedCharacters == target.length())
            {
                currentWindowLength = windowEnd - windowStart + 1 ;

                if(currentWindowLength < minimumWindowLength )
                {
                    minimumWindowLength = currentWindowLength ;
                    minimumWindowStart = windowStart;
                }

                char leftCharacter = source.charAt(windowStart);

                if(requiredFrequency.containsKey(leftCharacter) && windowFrequency.get(leftCharacter) <= requiredFrequency.get(leftCharacter))
                {
                    matchedCharacters--;
                }

                windowFrequency.put(leftCharacter , windowFrequency.getOrDefault(leftCharacter , 0) - 1);
                windowStart++;
            }
        }

        if(minimumWindowLength == Integer.MAX_VALUE)
        {
            System.out.println("");
        }
        else
        {
            System.out.println(source.substring(
            minimumWindowStart,
            minimumWindowStart + minimumWindowLength ) );
        }
        
    }
}

/*
--------------------------------------------------------------------
Problem Name : Minimum Window Substring

Problem:
Given two strings s and t, find the smallest substring of s that
contains all characters of t, including duplicate characters.
Return an empty string if no valid window exists.

Approach:
Use the Sliding Window technique with two pointers.

- Maintain the required character frequencies from t.
- Expand the right pointer to include characters in the window.
- Track the number of required characters matched.
- When the window becomes valid, shrink it from the left to find
  the smallest valid window.
- Continue until the entire string is processed.

Complexity:
Time  : O(n + m)
Space : O(n + m)
--------------------------------------------------------------------
*/