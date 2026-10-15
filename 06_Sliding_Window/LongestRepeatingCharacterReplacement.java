import java.util.*;

class LongestRepeatingCharacterReplacement
{
    public static void main(String A[])
    {
        String s = "AABABBA";
        int k = 1 ;
        int left = 0 ;
        int iLength = 0 ;
        int windowLength = 0 ;
        int maxFreq = 0  ;
        int replacements = 0 ;

        HashMap <Character , Integer> map = new HashMap <> ();
        
        for(int right = 0; right < s.length(); right++)
        {
            // Add right character
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            // Update max frequency
            if(map.get(s.charAt(right)) > maxFreq)
            {
                maxFreq = map.get(s.charAt(right));
            }

            windowLength = right - left + 1;
            replacements = windowLength - maxFreq;

            while(replacements > k)
            {
                // Remove character leaving from LEFT
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);

                left++;

                // Recalculate current window
                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            }

            // Current window is valid
            if(windowLength > iLength)
            {
                iLength = windowLength;
            }
        }

        System.out.println(iLength);

    }
}

/*
--------------------------------------------------------------------
Problem Name : Longest Repeating Character Replacement
LeetCode     : #424

Problem:
Given a string s containing uppercase English letters and an integer
k, you can replace at most k characters with any uppercase letter.

Return the length of the longest substring that can be converted
into a string containing only one distinct character using at most
k replacements.

Approach:
Use the Sliding Window technique with a HashMap.

- Expand the window using the right pointer and update the frequency
  of the current character.
- Maintain maxFreq, the maximum frequency of any character in the
  current window.
- Calculate the replacements required using:

      replacements = windowLength - maxFreq

- If replacements exceeds k, shrink the window from the left.
- Update the maximum valid window length.

The maximum frequency is maintained without recalculating it when
the left pointer moves. This allows an efficient sliding-window
solution while keeping the maximum window length correct.

Complexity:
Time  : O(n)
Space : O(1) for the fixed uppercase English alphabet
--------------------------------------------------------------------
*/