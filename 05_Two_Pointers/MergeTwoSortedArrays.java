class MergeTwoSortedArrays
{
    public static void main(String A[])
    {
        int arr1[] = {1, 4, 8, 10} ;
        int arr2[] = {2, 3, 9} ;

        int result[] = new int[arr1.length + arr2.length] ;

        int index1 = 0 , index2 = 0 , result_index = 0 ;

        while(true)
        {
            if(index1 < arr1.length && index2 < arr2.length)
            {
                if(arr1[index1] < arr2[index2])
                {
                    result[result_index] = arr1[index1];
                    index1++;
                    result_index++;
                }
                else if(arr2[index2] < arr1[index1])
                {
                    result[result_index] = arr2[index2];
                    index2++;
                    result_index++;
                }
                else
                {
                    result[result_index] = arr1[index1];
                    index1++;
                    result_index++;
                }
            }
            else if(index1 == arr1.length && index2 < arr2.length)
            {
                result[result_index] = arr2[index2];
                index2++;
                result_index++;
            }
            else if(index1 < arr1.length && index2 == arr2.length)
            {
                result[result_index] = arr1[index1];
                index1++;
                result_index++;
            }

            if(index1 == arr1.length && index2 == arr2.length)
            {
                break;
            }
        }

        for(Integer no : result)
        {
            System.out.print(no+"\t");
        }

    }
}

/*

Given two sorted arrays, merge them into one sorted array.

Example 1
arr1 = {1, 3, 5, 7}
arr2 = {2, 4, 6, 8}

Output:

{1, 2, 3, 4, 5, 6, 7, 8}
Example 2
arr1 = {1, 4, 8, 10}
arr2 = {2, 3, 9}

Output:

{1, 2, 3, 4, 8, 9, 10}
Example 3
arr1 = {1, 2, 2, 5}
arr2 = {2, 3, 5, 6}

Output:

{1, 2, 2, 2, 3, 5, 5, 6}
Rules
Both arrays are already sorted.
Create one result array.
Do not use Arrays.sort().
Keep duplicates.
Do not modify the original arrays.
Print the merged array.
🎯 Target Complexity
Time:  O(n + m)


*/