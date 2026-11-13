class MaximumVowelsInSubstring
{
    public static void main(String A[])
    {
        String s= "abciiidef" ;
        int k = 3 ;

        char ch = '\0';
        int maxVowel = 0;
        int windowVowel = 0 ;

        for(int i = 0 ; i < k ; i++)
        {
            ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                windowVowel++;
            }
        }

        maxVowel = windowVowel ;

        for(int i = k ; i < s.length() ; i++)
        {
            // ch from first window
            ch = s.charAt(i - k);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                windowVowel--;
            }

            // ch from this window
            ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                windowVowel++;
            }

            if(windowVowel > maxVowel)
            {
                maxVowel = windowVowel ;
            }
        }

        System.out.println(maxVowel);
        
    }
}


/*
Maximum Number of Vowels in a Substring of Given Length

Problem

Given a string s and an integer k, find the maximum number of vowels present in any contiguous substring of length k.

Vowels are:

a, e, i, o, u
Example 1
Input:
s = "abciiidef"
k = 3

Windows:

"abc" → 1 vowel
"bci" → 1 vowel
"cii" → 2 vowels
"iii" → 3 vowels
"iid" → 2 vowels
"ide" → 2 vowels
"def" → 1 vowel

Output:

3
Example 2
Input:
s = "aeiou"
k = 2

Output:

2
Example 3
Input:
s = "leetcode"
k = 3

Output:

2
More test cases
s = "rhythms"
k = 3
Output = 0
s = "hello"
k = 2
Output = 1
s = "aaaaa"
k = 3
Output = 3
s = "xyzabcdef"
k = 4
Output = 2
Requirements
Substring must be contiguous
Length must be exactly k
Find the maximum number of vowels
Aim for O(n) time
Extra space should be O(1)
*/