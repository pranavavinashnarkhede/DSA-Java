import java.util.*;

class PermutationInString
{
    public static void main(String A[])
    {
        String s1 = "hello";
        String s2 = "ooolleoooleh";

        char current = '\0';
        int matchedCharacter = 0;
        int left = 0;

        HashMap<Character, Integer> required = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Build frequency map of required characters
        for(int i = 0; i < s1.length(); i++)
        {
            current = s1.charAt(i);

            required.put( current, required.getOrDefault(current, 0) + 1 );
        }

        // Maintain a fixed-size sliding window
        for(int right = 0; right < s2.length(); right++)
        {
            current = s2.charAt(right);

            window.put( current, window.getOrDefault(current, 0) + 1 );

            // Count required character occurrences
            if(required.containsKey(current) && window.get(current) <= required.get(current))
            {
                matchedCharacter++;
            }

            // Remove the left character if window size exceeds s1 length
            if(right - left + 1 > s1.length())
            {
                char ch = s2.charAt(left);

                // Check before decreasing the frequency
                if(required.containsKey(ch) && window.get(ch) <= required.get(ch))
                {
                    matchedCharacter--;
                }

                window.put( ch, window.get(ch) - 1 );

                if(window.get(ch) == 0)
                {
                    window.remove(ch);
                }

                left++;
            }

            // All required characters are matched
            if(matchedCharacter == s1.length())
            {
                System.out.println("True");
                return;
            }
        }

        System.out.println("False");
    }
}

/*
Problem 11 — Permutation in String

Given two strings s1 and s2, return true if any permutation of s1 appears as a substring of s2. Otherwise, return false.

Examples
Input:
s1 = "ab"
s2 = "eidbaooo"

Output:
true

Because:

"ba"

is a permutation of "ab" and appears in s2.

Input:
s1 = "ab"
s2 = "eidboaoo"

Output:
false

No substring of length 2 contains exactly the characters a and b.

More examples
s1 = "adc"
s2 = "dcda"

Output:
true

Because "dca" is a permutation of "adc".

s1 = "a"
s2 = "a"

Output:
true
s1 = "abc"
s2 = "defgh"

Output:
false

*/