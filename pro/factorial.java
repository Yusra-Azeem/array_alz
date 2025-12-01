class factorial
{
    public static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            int s=1;
            for(int x=1;x<=n;x++)
            {
                s=s*x;
            }
            return s+fact(n-1);
        }
    }
}