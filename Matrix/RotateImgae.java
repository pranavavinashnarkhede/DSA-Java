class Solution {
    public void rotate(int[][] matrix) 
    {
        // code to transpose the matrix
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = i+1 ; j < matrix[i].length ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }

        // code to rotate the rows
        for(int k = 0 ; k < matrix.length ; k++)
        {
            for(int l = 0 ; l < matrix[k].length / 2; l++)
            {
                int length = matrix[k].length - 1 ;

                int temp = matrix[k][l];
                matrix[k][l] = matrix[k][length - l];
                matrix[k][length - l] = temp ;
            }
        }    
    }
}



/*
  Problem Name: 48. Rotate Image
 
  Problem:
  Given an n x n matrix, rotate the matrix 90 degrees clockwise.
  The rotation must be performed in-place without creating another matrix.
 
  Approach:
  1. Transpose the Matrix:
     - Swap matrix[i][j] with matrix[j][i].
     - Use j = i + 1 to avoid swapping elements twice.
 
  2. Reverse Each Row:
     - Swap the leftmost and rightmost elements of each row.
     - Continue until the middle of the row is reached.
 
  Complexity Analysis:
  Time Complexity: O(n^2)
  Space Complexity: O(1)
 */

