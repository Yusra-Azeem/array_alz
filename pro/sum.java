class sum
{
    public static int sum_digit(int n)
    {
        if(n/10==0)
        {
            return n;
        }
        else
        {
            return (n%10)+sum_digit(n/10);
        }
    }
}
    