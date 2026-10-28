import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) 
    {
        StringBuilder sb = new StringBuilder () ;

        for(char no : num.toCharArray())
        {
            while(k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > no)
            {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(no);
        }

        while(k > 0)
        {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int i = 0 ;

        while(i < sb.length()  && sb.charAt(i) == '0')
        {
            i++;
        }

        String result = sb.substring(i);

        return result.isEmpty() ? "0" : result ;
       
    }
}


/*
  Problem: Remove K Digits
  LeetCode: #402
 
  Approach:
  Use a monotonic increasing stack to build the smallest number.
  Remove larger digits from the stack when a smaller digit arrives,
  as long as k > 0.
  If k remains, remove digits from the end.
  Remove leading zeros and return "0" if the result is empty.
 
  Time Complexity: O(n) amortized
  Space Complexity: O(n)
 */

