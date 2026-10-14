import java.util.*;

class FruitsIntoBaskets
{
    public static void main(String A[])
    {
        int fruits[] = {1,2,3,2,2};

        int unique = 0 ;
        int left = 0 ;
        int maxLen = 0 ;
        int temp = 0 ;

        HashMap <Integer , Integer> map = new HashMap <> ();

        for(int right = 0 ; right < fruits.length ; right++)
        {
            temp = fruits[right];

            if(!map.containsKey(temp))
            {
                unique++;
            }

            map.put(temp , map.getOrDefault(temp , 0) + 1);

            while(unique > 2)
            {
                temp = fruits[left];

                map.put(temp , map.get(temp) - 1);

                if(map.get(temp) == 0)
                {
                    map.remove(temp);
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
Problem Name : Fruits Into Baskets
LeetCode     :904

Problem:
Given an integer array fruits, find the length of the longest
contiguous subarray containing at most two distinct fruit types.

Each basket can hold only one type of fruit, and you can collect
one fruit from each tree in a contiguous range.

Approach:
Use the Sliding Window technique with a HashMap.

- Expand the window using the right pointer.
- Store the frequency of each fruit type in the HashMap.
- Track the number of distinct fruit types in the window.
- If the window contains more than two distinct types, shrink it
  from the left until at most two types remain.
- Update maxLen with the maximum valid window length.

The HashMap stores fruit frequencies so a fruit type can be removed
when its frequency becomes zero.

Complexity:
Time  : O(n)
Space : O(n)
--------------------------------------------------------------------
*/