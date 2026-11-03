class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        for(int i = 0 ; i < image.length ; i++)
        {
            int left = 0 ;
            int right = image[i].length - 1 ;

            while(left <= right)
            {
                int temp = image[i][left];
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp ^ 1;

                left++;
                right--;
            }
        }

        return image;
    }
}

/*
--------------------------------------------------------------------
Problem Name : Flipping an Image
LeetCode     : #832

Problem:
Given a binary matrix, first flip each row horizontally and then
invert every bit (0 becomes 1 and 1 becomes 0).

Approach:
Use the Two Pointers technique to flip and invert each row
in a single traversal.

- Traverse each row of the matrix.
- Initialize left = 0 and right = image[i].length - 1.
- Continue while left <= right.
- Store the left element in a temporary variable.
- Move the right element to the left position and invert it
  using XOR with 1.
- Move the original left element to the right position and
  invert it using XOR with 1.
- Increment left and decrement right.
- When left == right, the middle element is inverted correctly.
- Return the modified image matrix.

The XOR operator with 1 inverts a binary value:
0 ^ 1 = 1
1 ^ 1 = 0

Complexity:
Time  : O(m * n), where m is the number of rows and n is the
        number of columns.
Space : O(1) auxiliary space because the matrix is modified in place.
--------------------------------------------------------------------
*/