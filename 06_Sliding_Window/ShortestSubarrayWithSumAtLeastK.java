import java.util.*;

class ShortestSubarrayWithSumAtLeastK
{
    public static void main(String A[])
    {
        int nums[] = {2,-1,2};
        int k = 3 ; 

        int sum = 0 ;

        int prefix[] = new int[nums.length+1];

        prefix[0] = 0 ;

        for(int i = 0 ; i < nums.length ; i++)
        {
            prefix[i+1] = prefix[i-1] + nums[i];
            System.out.println(sum);

        }

        for(Integer no : prefix )
        {
            System.out.println(no);
        }

        
        

    }
}
/*
LeetCode #862: Shortest Subarray with Sum at Least K

Difficulty: Hard
Program Name: ShortestSubarrayWithSumAtLeastK.java

Problem

Given an integer array nums and an integer k, find the length of the shortest non-empty subarray whose sum is at least k.

If no such subarray exists, return -1.

Examples

Example 1

nums = [1]
k = 1

Output = 1

Example 2

nums = [1,2]
k = 4

Output = -1

Example 3

nums = [2,-1,2]
k = 3

Output = 3

Because:

2 + (-1) + 2 = 3

*/