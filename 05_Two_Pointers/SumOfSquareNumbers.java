class SumOfSquareNumbers {
    public static void main(String A[]) 
    {
        // input
        int c = 5 ;

        long left = 0 ;
        long right =(int) Math.sqrt(c);
        long sum = 0 ;
        boolean flag = false;
        
        // if c is 0 then return true because 0 * 2 + 0 * 2 = 0
        if(c == 0)
        {
            flag = true;

        }
        else
        {
            while(left <= right)
            {
                sum = left * left + right * right ;
                if(sum == c)
                {
                    flag = true ;
                    break;
                }
                else if(sum > c)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }

        System.out.println(flag);
    }
}
