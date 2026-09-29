class PartitionArray
{
    public static void main(String[] args)
    {
        int arr[] = {2, 1, 0, 2, 1, 0, 1};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                arr[mid] = arr[low];
                arr[low] = 0;

                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else
            {
                arr[mid] = arr[high];
                arr[high] = 2;

                high--;
            }
        }

        for(int no : arr)
        {
            System.out.print(no + "\t");
        }
    }
}

/*
--------------------------------------------------------------------
Problem Name : Partition Array

Problem:
Given an array containing only 0, 1, and 2, rearrange the array
so that all 0s come first, followed by all 1s, and then all 2s.

Approach:
Use three pointers: low, mid, and high.

- If arr[mid] is 0, swap it with the element at low and move both
  low and mid forward.
- If arr[mid] is 1, move mid forward.
- If arr[mid] is 2, swap it with the element at high and move high
  backward without moving mid.

This partitions the array into three regions in a single pass.

Complexity:
Time  : O(n)
Space : O(1)
--------------------------------------------------------------------
*/