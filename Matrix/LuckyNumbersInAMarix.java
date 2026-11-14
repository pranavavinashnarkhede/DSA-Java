class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List <Integer> list = new ArrayList <> () ;

        int min = 0 , minIndex = 0 ;

        for(int i = 0 ; i < matrix.length ; i++)
        {
            min = matrix[i][0];
            minIndex = 0 ;

            for(int j = 1 ; j < matrix[i].length ; j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                    minIndex = j ;
                }
            }

            boolean saddle = true ;

            for(int k = 0 ; k < matrix.length ; k++)
            {
                if(matrix[k][minIndex] > min)
                {
                    saddle = false ;
                    break ;
                }
            }

            if(saddle)
            {
                list.add(min);
            }

        }

        return list ;    
    }
}


/*
--------------------------------------------------------------------
Problem Name : Lucky Numbers in a Matrix
LeetCode     : #1380

Problem:
Given an m x n matrix, find all lucky numbers.

A lucky number is an element that is the minimum element in its
row and the maximum element in its column.

Approach:
Use Row Traversal and Column Traversal to identify lucky numbers.

- Create an ArrayList to store the lucky numbers.
- Traverse each row of the matrix.
- Initialize min with the first element of the current row.
- Initialize minIndex = 0 to store the column index of the minimum
  element.
- Traverse the remaining elements of the current row.
- If a smaller element is found, update min and minIndex.
- Initialize a boolean variable saddle = true.
- Traverse the column at minIndex.
- If any element in that column is greater than min, set
  saddle = false because min is not the maximum in that column.
- If saddle remains true, add min to the result list.
- Repeat the process for all rows.
- Return the list containing all lucky numbers.

A lucky number must satisfy two conditions:
1. It must be the smallest element in its row.
2. It must be the largest element in its column.

Complexity:
Time  : O(m * n + m * m)
Space : O(1) auxiliary space, excluding the result list.

Where m represents the number of rows and n represents
the number of columns.

--------------------------------------------------------------------
*/