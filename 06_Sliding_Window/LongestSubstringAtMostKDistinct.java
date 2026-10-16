import java.util.*;

class LongestSubstringAtMostKDistinct
{
    public static void main(String A[])
    {
        String s = "abcadcacacaca";
        int k = 3 ;
        
        int left = 0 , right = 0 ;
        int maxLength = 0 , windowLength = 0 ;
        char currentCharacter = '\0';
        int distinctCharacters = 0 ;

        HashMap <Character , Integer> map = new HashMap <> ();

        for(right = 0 ; right < s.length() ; right++)
        {
            currentCharacter = s.charAt(right);

            if(!map.containsKey(currentCharacter))
            {
                distinctCharacters++;
            }
            
            map.put(currentCharacter , map.getOrDefault(currentCharacter , 0) + 1);

            while(distinctCharacters > k)
            {
                currentCharacter = s.charAt(left);

                map.put(currentCharacter , map.getOrDefault(currentCharacter , 0) - 1);
                left++;

                if(map.get(currentCharacter) == 0)
                {
                    map.remove(currentCharacter);
                    distinctCharacters--;
                }

            }

            windowLength = right - left + 1 ; 

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
Problem Name : Longest Substring with At Most K Distinct Characters

Problem:
Given a string s and an integer k, find the length of the longest
contiguous substring containing at most k distinct characters.

Approach:
Use the Sliding Window technique with two pointers and a HashMap.

- Expand the window using the right pointer.
- Store the frequency of each character in the HashMap.
- Track the number of distinct characters in the window.
- If the number of distinct characters exceeds k, shrink the window
  from the left until it becomes valid.
- Remove a character from the map when its frequency becomes zero.
- Update maxLength for every valid window.

Complexity:
Time  : O(n)
Space : O(k)

Where n is the length of the string.
--------------------------------------------------------------------
*/