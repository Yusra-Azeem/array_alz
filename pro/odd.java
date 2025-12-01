class odd
{
    public static int count(int n)
    {
        if(n<10)
        {
             return n%2!=0?n:0;

        }
        else
        {
            return count(n/10)+((n%10)%2!=0?(n%10):0);
        }

    }
}